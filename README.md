# VectorRuntime

VectorRuntime is a lightweight Android library that allows you to change VectorDrawable colors and strokes at runtime without editing XML files.

<p align="center">
  <img src="Preview/Animation.gif" alt="VectorRuntime Animation Preview" width="280"/>
</p>


## Features

- Change path fill colors.
- Change stroke colors and widths.
- Modify paths using an index or name.
- No XML changes required.
- Simple Java API.
- Automatically redraw updated vectors.

## Installation

Add the library module to your `build.gradle.kts` file:

```kotlin
dependencies {
    implementation(project(":vtruntime"))
}
```

## Usage

### 1. Load a VectorDrawable

First, load your vector drawable from resources.

```java
Antik antik = Antik.load(this, R.drawable.user);
```

### 2. Change Path Color

Change the fill color of the first path.

```java
antik.setPathColor(0, Color.BLACK);
```

Path indexes start from `0`.

### 3. Change Stroke Color

Set the stroke color of the first path.

```java
antik.setStrokeColor(0, Color.WHITE);
```

### 4. Change Stroke Width

Set the stroke width of the first path.

```java
antik.setStrokeWidth(0, 2.0f);
```

### 5. Display the Drawable

Apply the updated drawable to your ImageView.

```java
antik.into(mImage);
```

## Change Color Using Path Name

You can also change a path color using its XML name.

Example XML:

```xml
<path
    android:name="bg_circle"
    android:fillColor="#FF905D4C"
    android:pathData="..." />
```

Java:

```java
Antik antik = Antik.load(this, R.drawable.user);

antik.setPathColor("bg_circle", Color.RED);
antik.into(mImage);
```

## API Reference

| Method | Description |
|---|---|
| `Antik.load(context, resId)` | Load a vector drawable |
| `setPathColor(index, color)` | Change fill color by index |
| `setPathColor(name, color)` | Change fill color by name |
| `setStrokeColor(index, color)` | Change stroke color by index |
| `setStrokeColor(name, color)` | Change stroke color by name |
| `setStrokeWidth(index, width)` | Change stroke width by index |
| `setStrokeWidth(name, width)` | Change stroke width by name |
| `getPathCount()` | Get total number of paths |
| `getPathColor(index)` | Get path color by index |
| `getPathColor(name)` | Get path color by name |
| `getDrawable()` | Get the drawable |
| `into(imageView)` | Set drawable to ImageView |

## How It Works

VectorRuntime loads a VectorDrawable and allows you to modify its individual paths.

After a path is changed, the drawable is automatically updated and redrawn.

## License

Based on Android Open Source Project components. See the source files for license details.
