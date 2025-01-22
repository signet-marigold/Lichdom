# From https://discourse.nixos.org/t/minecraft-cant-load-glx/50044/4
# And https://discourse.nixos.org/t/issues-with-opengl-in-minecraft-development-environments/37532/5
# Fixes error: Cannot find glfw glx: no glx : NixOS bug
# Credit to Squalmals & jonringer
#
# First start nix-shell in this directory
# Then run ./gradlew runClient

{ pkgs ? import <nixpkgs> {} }:
pkgs.mkShell {
  shellHook = ''
    export LD_LIBRARY_PATH="''${LD_LIBRARY_PATH}''${LD_LIBRARY_PATH:+:}${pkgs.libglvnd}/lib"
  '';
}
