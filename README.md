# Toggle Item Frames — Minecraft 26.3 (all loaders + 1.20.1 Fabric/Forge)

Right-click an item frame to toggle its invisibility flag. Scaffold release: rules and metadata only; in-game event wiring is not included.

## Status

This repository contains a **scaffold**: pure-Java rule classes with JUnit tests, thin loader
entrypoints that register and log initialization, and complete mod metadata for every variant.
In-game event wiring is not included in this release — see VERIFICATION.md in each workflow run
for the distinction between compiled, loaded and functionally verified.

## Layout

- `26.3-fabric/`, `26.3-forge/`, `26.3-neoforge/` — Minecraft 26.3, Java 25.
- `1.20.1-fabric/`, `1.20.1-forge/` — Minecraft 1.20.1, Java 17.

## Build & tests (GitHub only)

`build.yml` compiles/tests each variant and uploads jars + test reports.
`launcher-test.yml` boots a real headless client (Fabric/NeoForge) or a headless server (Forge)
for each variant with the built mod installed. No local builds.

## Attribution

Inspired by "Toggle Item Frames" on Modrinth (MIT). Independent clean-room implementation.
