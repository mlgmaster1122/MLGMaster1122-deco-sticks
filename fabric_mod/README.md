# Decorative Sticks - Fabric Mod for Minecraft 1.21.1

**Converted from Bedrock Edition addon by Silzio**

## Overview
This Fabric mod adds **256 decorative stick blocks** to Minecraft Java Edition 1.21.1. Perfect for detailed builds, structural accents, and creative detailing!

## Features
- 🪵 **8 Stick Types**: Vertical (left/right/center/middle), Horizontal (top/middle/bottom), Cross
- 🎨 **32 Colors**: All 16 terracotta + all 16 concrete colors = 256 total blocks
- 🧭 **Directional**: Blocks orient based on placement direction (N/S/E/W)
- ⛏️ **Mineable with Axe**: Fast breaking with proper tool
- 🛠️ **Craftable**: Simple recipes using stick + material

## Installation

### Requirements
- Minecraft Java Edition 1.21.1
- Fabric Loader 0.16.5 or higher
- Fabric API 0.105.0+1.21.1 or higher

### Steps
1. **Install Fabric Loader**
   - Download from https://fabricmc.net/use/
   - Run installer and select Minecraft 1.21.1
   
2. **Install Fabric API**
   - Download from https://modrinth.com/mod/fabric-api
   - Place in `.minecraft/mods` folder

3. **Install This Mod**
   - Download `decorative-sticks-1.0.0.jar`
   - Place in `.minecraft/mods` folder
   - Launch Minecraft with Fabric profile

## Building from Source

### Prerequisites
- Java 21 JDK
- Gradle (included via wrapper)

### Build Instructions
```bash
# Navigate to mod directory
cd decorative-sticks-fabric

# Build the mod (Windows)
gradlew.bat build

# Build the mod (Mac/Linux)
./gradlew build

# Output will be in build/libs/
```

The compiled JAR will be at: `build/libs/decorative-sticks-1.0.0.jar`

## Usage

### Crafting Recipes
All blocks use this simple pattern:
```
[Terracotta or Concrete Block]
         [Stick]
```

**Examples:**
- White Terracotta + Stick = Vertical Left White Terracotta
- Blue Concrete + Stick = Vertical Left Blue Concrete
- Any material works with any stick type!

### Placement
- Right-click to place
- Block automatically faces the direction you're looking
- Rotates around Y-axis (North, South, East, West)

### Breaking
- Fastest with Axe
- Drops itself when mined
- Destroyed by explosions (no drop)

### Creative Mode
- Find all blocks in **Building Blocks** tab
- Search "stick" or "decorative" to filter

## Block Types

### Vertical Sticks
- **Left**: Stick positioned on left edge
- **Right**: Stick positioned on right edge  
- **Center**: Stick in center (small, decorative)
- **Middle**: Stick in middle-back position

### Horizontal Sticks
- **Top**: Horizontal beam at top
- **Middle**: Horizontal beam at mid-height
- **Bottom**: Horizontal beam at bottom

### Cross
- Large cross shape spanning full height

## Technical Details

### Block Properties
- Hardness: Same as source material (terracotta/concrete)
- Blast resistance: Same as source material
- Tool: Axe (fastest), can mine with hand
- Light: No light emission
- Transparency: Partial (non-full blocks)

### Block IDs
Format: `decorative_sticks:[type]_[color]`

Examples:
- `decorative_sticks:vertical_left_white_terracotta`
- `decorative_sticks:horizontal_top_blue_concrete`  
- `decorative_sticks:cross_red_terracotta`

### Commands
```
# Give yourself a block
/give @s decorative_sticks:vertical_left_white_terracotta

# Fill an area
/fill ~ ~ ~ ~10 ~10 ~10 decorative_sticks:cross_black_concrete

# Test all blocks exist
/give @s decorative_sticks:vertical_left_white_terracotta
```

## Development

### Project Structure
```
decorative-sticks-fabric/
├── src/main/
│   ├── java/com/decorativesticks/
│   │   └── DecorativeSticks.java (256 block registrations)
│   └── resources/
│       ├── assets/decorative_sticks/
│       │   ├── blockstates/ (256 files)
│       │   ├── models/block/ (256 files)
│       │   ├── models/item/ (256 files)
│       │   └── lang/en_us.json
│       ├── data/decorative_sticks/
│       │   ├── recipes/ (256 files)
│       │   └── loot_tables/blocks/ (256 files)
│       ├── data/minecraft/tags/blocks/mineable/
│       │   └── axe.json
│       └── fabric.mod.json
├── build.gradle
├── gradle.properties
└── settings.gradle
```

### Adding New Blocks
1. Edit `DecorativeSticks.java` to register new block
2. Add blockstate JSON in `assets/decorative_sticks/blockstates/`
3. Add block model in `assets/decorative_sticks/models/block/`
4. Add item model in `assets/decorative_sticks/models/item/`
5. Add recipe in `data/decorative_sticks/recipes/`
6. Add loot table in `data/decorative_sticks/loot_tables/blocks/`
7. Add to language file

## Troubleshooting

**Mod won't load**
- Verify Fabric Loader is installed for 1.21.1
- Check Fabric API is in mods folder
- Look at latest.log for error messages

**Blocks have no texture**
- Resource files may be corrupted
- Verify all files are in correct locations
- Check that block models reference correct textures

**Recipes don't work**
- Ensure Fabric API is installed
- Check recipe files are valid JSON
- Try `/reload` command

**Blocks don't drop when broken**
- Check loot tables exist
- Verify `mineable/axe.json` tag includes blocks

## Known Issues
- None currently

## Compatibility
- Compatible with most Fabric mods
- No known conflicts
- Works in multiplayer (server needs mod too)

## Credits
- **Original Bedrock Addon**: Silzio
- **Java/Fabric Conversion**: Automated conversion (February 2026)
- **Textures**: Uses vanilla Minecraft textures

## License
MIT License - Free to use, modify, and distribute

## Support
For issues or questions:
1. Check this README first
2. Review Troubleshooting section
3. Check latest.log for errors
4. Report issues with log file attached

## Version History
- **1.0.0** (2026-02-07): Initial release
  - 256 decorative stick blocks
  - All stick types and colors implemented
  - Recipes and loot tables added

---

Enjoy building with decorative sticks! 🪵✨
