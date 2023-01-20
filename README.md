
# IIndicators 

is a jetpack Compose library will help you showing indicators in your app within buttons, pagers everywhere. 


## Demo
<img src="https://user-images.githubusercontent.com/8763140/213685184-7e1fe87b-bdc7-475b-930c-ec9f2c56ea66.gif" width="30%" height="30%"/>

## Download

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.ibenabdallah/iindicators/badge.svg)](https://central.sonatype.dev/artifact/io.github.ibenabdallah/iindicators/1.0.0)

### Gradle
Add the dependency below to your module level `build.gradle` :

```groovy
dependencies { 

    implementation 'io.github.ibenabdallah:iindicators:1.0.0'
 
 }
```

## Usage 
You can implement your indicators with composable function as seen in the below:

```kotlin

var selectedPage by remember { mutableStateOf(0) }
val count = 7

Indicators(
    count = count,
    size = 10,
    spacer = 5,
    selectedColor = Color.Red,
    unselectedColor = PurpleGrey40,
    modifier = Modifier.align(Alignment.Center),
    selectedIndex = selectedPage,
    selectedLength = 50
)

```



# Find this library useful? ❤️

Star it and Follow me for more content like this. 
