# Quick Start Guide - Decorative Sticks Fabric Mod

## What You Need
1. ✅ Minecraft Java Edition 1.21.1
2. ✅ Fabric Loader (https://fabricmc.net/use/)
3. ✅ Fabric API (https://modrinth.com/mod/fabric-api)
4. ✅ This mod JAR file

## Installation (5 minutes)

### Step 1: Install Fabric Loader
1. Go to https://fabricmc.net/use/
2. Download the **Installer**
3. Run it and select **Minecraft 1.21.1**
4. Click Install
5. ✅ Done! You'll see "Fabric" profile in launcher

### Step 2: Install Fabric API
1. Go to https://modrinth.com/mod/fabric-api
2. Download version **0.105.0+1.21.1** (or newer for 1.21.1)
3. Find your `.minecraft/mods` folder:
   - **Windows**: Press `Win+R`, type `%appdata%\.minecraft\mods`
   - **Mac**: `~/Library/Application Support/minecraft/mods`
   - **Linux**: `~/.minecraft/mods`
4. Drop `fabric-api-[version].jar` into the mods folder

### Step 3: Install Decorative Sticks
1. Take the `decorative-sticks-1.0.0.jar` file
2. Put it in the same `.minecraft/mods` folder
3. ✅ That's it!

### Step 4: Launch & Test
1. Open Minecraft Launcher
2. Select **Fabric** profile
3. Click **Play**
4. Create/join a world
5. Test with command:
   ```
   /give @s decorative_sticks:vertical_left_white_terracotta
   ```
6. 🎉 If you get a stick block, it works!

## Quick Usage

### Get Blocks
**Creative Mode**: Look in Building Blocks tab, search "stick"

**Survival Mode**: Craft with this pattern:
```
[Terracotta/Concrete]
      [Stick]
```

### Place Blocks
- Right-click to place
- Block faces the direction you're looking
- Use for pillars, beams, crosses, detailing!

## Need to Build from Source?

If you downloaded the source folder instead of JAR:

```bash
# Windows
gradlew.bat build

# Mac/Linux  
./gradlew build

# Find output in: build/libs/decorative-sticks-1.0.0.jar
```

Then follow Step 3 above with the built JAR.

## Troubleshooting

**"Mod requires Fabric API"**
→ Install Fabric API (Step 2 above)

**Blocks have no texture**
→ Make sure you have the full mod file, not just source code

**Crashes on launch**
→ Check Java version (need Java 21), check logs in `.minecraft/logs/latest.log`

**Multiplayer not working**
→ Server needs Fabric Loader + Fabric API + this mod too!

## All Done! 🎉

You now have 256 decorative stick blocks to use!

Try these commands to explore:
- `/give @s decorative_sticks:cross_red_concrete`
- `/give @s decorative_sticks:horizontal_top_blue_terracotta`
- `/give @s decorative_sticks:vertical_center_lime_concrete`

Check README.md for full documentation!
