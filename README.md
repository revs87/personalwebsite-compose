[![Static Badge](https://img.shields.io/badge/release%20-%20v1.0.0%20-%20%231082C3)](https://github.com/revs87/personalwebsite-compose/releases/tag/1.0.0)
![Static Badge](https://img.shields.io/badge/License%20-%20MIT%20License%20-%20%231082C3)

![image](https://img.shields.io/badge/Kobweb-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white)

## Content
Rui Vieira's Introduction website with personal contacts

![rvintro](https://github.com/revs87/personalwebsite-compose/blob/main/assets/rvintro.jpg)


## Project Requirements
- Install Java 11+ and define the environment variable JAVA_HOME.
- Install the latest IntelliJ IDE (for easy install use JetBrains Toolbox)
- Copy Kobweb's [latest release archive](https://github.com/varabyte/kobweb/releases) and add Kobweb's binary folder to the environment variable PATH.

## Tech Stack
### Core
- Kobweb Kotlin
- Kobweb Compose

## Kobweb Details
This is a [Kobweb](https://github.com/varabyte/kobweb) project bootstrapped with the `app/empty` template.

This template is useful if you already know what you're doing and just want a clean slate. By default, it
just creates a blank home page (which prints to the console so you can confirm it's working)

If you are still learning, consider instantiating the `app` template (or one of the examples) to see actual,
working projects.

## Getting Started

First, run the development server by typing the following command in a terminal under the `site` folder:

```bash
$ cd site
$ kobweb run
```

Open [http://localhost:8080](http://localhost:8080) with your browser to see the result.

You can use any editor you want for the project, but we recommend using **IntelliJ IDEA Community Edition** downloaded
using the [Toolbox App](https://www.jetbrains.com/toolbox-app/).

Press `Q` in the terminal to gracefully stop the server.

### Live Reload

Feel free to edit / add / delete new components, pages, and API endpoints! When you make any changes, the site will
indicate the status of the build and automatically reload when ready.

## Exporting the Project

When you are ready to ship, you should shutdown the development server and then export the project using:

```bash
kobweb export
```

When finished, you can run a Kobweb server in production mode:

```bash
kobweb run --env prod
```

If you want to run this command in the Cloud provider of your choice, consider disabling interactive mode since nobody
is sitting around watching the console in that case anyway. To do that, use:

```bash
kobweb run --env prod --notty
```

Kobweb also supports exporting to a static layout which is compatible with static hosting providers, such as GitHub
Pages, Netlify, Firebase, any presumably all the others. You can read more about that approach here:
https://bitspittle.dev/blog/2022/staticdeploy
