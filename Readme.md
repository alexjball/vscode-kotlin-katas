# Basic VSCode-Compatible Kotlin Kata Setup

## Host Installation
Follow the steps to install a JDK and the Kotlin Compiler [here](https://kotlinlang.org/docs/tutorials/command-line.html).

I recommend using SDKMAN! on OS X and Linux:

```
sdk install java 14.0.1.hs-adpt
sdk install kotlin
```

On Windows, I recommend using the [AdoptOpenJDK installer](https://adoptopenjdk.net/) for the JDK and [Chocolatey](https://chocolatey.org/packages/kotlinc) for the Kotlin compiler

## Usage

To run tests whenever files are modified:

```
./gradlew -t test
```

To run the main aplication:

```
./gradlew run --args=Arun
```