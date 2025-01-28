# Minecraft dev nixos flake library loader
# https://gist.github.com/Lgmrszd/98fb7054e63a7199f9510ba20a39bc67
# Simply run `nix develop` on a nix system running flakes and nix command support
{
  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-24.11";
  };

  outputs = { self, nixpkgs }:
  
  let 
    pkgs = nixpkgs.legacyPackages.x86_64-linux;
    libs = with pkgs; [
        libpulseaudio
        libGL
        glfw
        openal
        stdenv.cc.cc.lib
      ];
  in {
    devShell.x86_64-linux = pkgs.mkShell {
      packages = [];
      buildInputs = libs;
      LD_LIBRARY_PATH = pkgs.lib.makeLibraryPath libs;
      shellHook = ''
          echo "Starting runClient target"
          ./gradlew runClient
          echo "Exiting nix development shell"
          exit
        '';
    };
  };
}
