# cousier-apps

![build](https://github.com/$git_username$/$name;format="lower,hyphen"$/workflows/main/badge.svg)
[![Maven Central](https://img.shields.io/maven-central/v/$organization;format="package"$/$name;format="lower,hyphen"$.svg)](https://maven-badges.herokuapp.com/maven-central/$organization;format="package"$/$name;format="lower,hyphen"$)

This is my own `coursier` channel!

You can do your own using [coursier-channel.g8](https://github.com/regadas/coursier-channel.g8)

## Usage

```bash
cs install \
  --default-channels=false \
  --channel $organization;format="package"$:$name;format="lower,hyphen"$ \
  <app>
```
