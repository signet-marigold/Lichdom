{
  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-24.11";
  };

  outputs = { self, nixpkgs }:
  let
    system = "x86_64-linux";
    pkgs = nixpkgs.legacyPackages.${system};
    libs = with pkgs; [
      jdk21
      libpulseaudio
      libGL
      glfw
      openal
      stdenv.cc.cc.lib
      flite
    ];
    commonInputs = {
      buildInputs = libs;
      LD_LIBRARY_PATH = pkgs.lib.makeLibraryPath libs;
    };
  in with pkgs; {

    devShells.${system} = {
      # nix develop ./#dev
      dev = mkShell (commonInputs // {
        shellHook = ''
          export JAVA_VERSION=$(java --version | awk 'NR==1 {print $2}')
          export PS1="(java v$JAVA_VERSION) \[\e[1;32m\]\u@\h\[\e[0m\]:\[\e[1;34m\]\w\[\e[0m\]\$ "
        '';
      });
      
      # nix develop ./#test
      test = mkShell (commonInputs // {
        shellHook = ''
          echo "Starting runClient target"
          ./gradlew runClient
          echo "Exiting nix development shell"
          exit
        '';
      });
    };
  };
}
