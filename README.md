# Paper 1.21.4 - Hard (New Stack Plugin Template)

[![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/technologies/downloads/)
[![Spigot](https://img.shields.io/badge/Spigot-%23EE8E2D.svg?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAOCAMAAAAolt3jAAAABGdBTUEAALGPC/xhBQAAACBjSFJNAAB6JgAAgIQAAPoAAACA6AAAdTAAAOpgAAA6mAAAF3CculE8AAAAkFBMVEXveRzveR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3veR3///9OMgvJAAAAL3RSTlMAAAAAAAAAAAAAAAAAABqr9fWrGhOQ+/uQExGI+PiIEQyA9/eADAl39ncJBm/z828GVD8TCg8AAAABYktHRDCu3C3kAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH5wMQDjgTRIv8JgAAAGdJREFUCNdjYGBkggNGBmYWVjZ2DiBgZ2NlYWZiZObk4ubh5eMHAgF+Pl4ebk4mJgFBIWERUTEgEBMVERYSFGASl5CUkpaRlQMCOVkZaSlJcSYFRSVlFVU1dSBQU1VRVlJUYAIAHscHVXA7u9AAAAAldEVYdGRhdGU6Y3JlYXRlADIwMjMtMDMtMTZUMTQ6NTY6MTkrMDA6MDCkvfDDAAAAJXRFWHRkYXRlOm1vZGlmeQAyMDIzLTAzLTE2VDE0OjU2OjE5KzAwOjAw1eBIfwAAACh0RVh0ZGF0ZTp0aW1lc3RhbXAAMjAyMy0wMy0xNlQxNDo1NjoxOSswMDowMIj1aKAAAAAASUVORK5CYII=)](https://www.spigotmc.org/)
[![Forge](https://img.shields.io/badge/Forge-%23E04E14.svg?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAOCAMAAAAolt3jAAAABGdBTUEAALGPC/xhBQAAACBjSFJNAAB6JgAAgIQAAPoAAACA6AAAdTAAAOpgAAA6mAAAF3CculE8AAAAflBMVEXkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiTkTiT///+72YbIAAAAKHRSTlMAAAAAAAAAAAAAAAEGDhQZHB0cGRQOBgEEFSYzOz08OzMmFQQNLkVGRS4NmgH+HgAAAAFiS0dEKcq3hSQAAAAJcEhZcwAACxMAAAsTAQCanBgAAAAHdElNRQfnAxAOOQo9aFNYAAAAZ0lEQVQI12NgYGRiZmFlY+fg5OLm4eXjFxAUEmZgFBEVE5eQlJKWkZWTV1BUUlZhYFRVU9fQ1NLW0dXTNzA0MjZhYDI1M7ewtLK2sbWzd3B0cnZhYHZ1c/fw9PL28fXzDwgMCmYAAIwLB1Vv1rX5AAAAJXRFWHRkYXRlOmNyZWF0ZQAyMDIzLTAzLTE2VDE0OjU3OjEwKzAwOjAwRMIDTgAAACV0RVh0ZGF0ZTptb2RpZnkAMjAyMy0wMy0xNlQxNDo1NzoxMCswMDowMDWfu7IAAAAodEVYdGRhdGU6dGltZXN0YW1wADIwMjMtMDMtMTZUMTQ6NTc6MTArMDA6MDBi6pptAAAAAElFTkSuQmCC)](https://files.minecraftforge.net/net/minecraftforge/forge/)
[![Bukkit](https://img.shields.io/badge/Bukkit-%23366488.svg?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAOCAMAAAAolt3jAAAABGdBTUEAALGPC/xhBQAAACBjSFJNAAB6JgAAgIQAAPoAAACA6AAAdTAAAOpgAAA6mAAAF3CculE8AAAAflBMVEU2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIg2ZIj///9FDFSFAAAAKHRSTlMAAAAAAAAAAAAAAAEGDhQZHB0cGRQOBgEEFSYzOz08OzMmFQQNLkVGRS4NmgH+HgAAAAFiS0dEKcq3hSQAAAAJcEhZcwAACxMAAAsTAQCanBgAAAAHdElNRQfnAxAOOhcgS9JdAAAAZ0lEQVQI12NgYGRiZmFlY+fg5OLm4eXjFxAUEmZgFBEVE5eQlJKWkZWTV1BUUlZhYFRVU9fQ1NLW0dXTNzA0MjZhYDI1M7ewtLK2sbWzd3B0cnZhYHZ1c/fw9PL28fXzDwgMCmYAAIwLB1Vv1rX5AAAAJXRFWHRkYXRlOmNyZWF0ZQAyMDIzLTAzLTE2VDE0OjU4OjIzKzAwOjAwAWvBmAAAACV0RVh0ZGF0ZTptb2RpZnkAMjAyMy0wMy0xNlQxNDo1ODoyMyswMDowMHB2eSQAAAAodEVYdGRhdGU6dGltZXN0YW1wADIwMjMtMDMtMTZUMTQ6NTg6MjMrMDA6MDAlY1jfAAAAAElFTkSuQmCC)](https://dev.bukkit.org/)
[![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://maven.apache.org/download.cgi)
[![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)](https://gradle.org/install/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/download/)

## Overview

This repository is a custom plugin template built for **Minecraft Paper 1.21.4** that utilizes a new conceptual "hard stack" system. It serves as a base framework for building challenging gameplay extensions, optimized server behavior, or mechanic overhauls for Paper-based servers.

## Features

- ✅ Built on Paper 1.21.4
- 🧩 New "hard stack" plugin logic included
- 🔄 Designed to be extended as a standalone plugin or base layer
- 🚀 Ready for production or development servers
- 🧪 Open for experimentation and improvements

## Getting Started

### Requirements

- Java 17+
- Paper 1.21.4 Server
- Gradle or Maven (for building)
- IntelliJ IDEA (recommended)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/jackharvest-eu/paper-1.21.4-hard.git
   cd paper-1.21.4-hard
