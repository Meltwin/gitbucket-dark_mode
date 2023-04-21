# Gitbucket-Dark-Mode

This plug-in provides a dark mode theme for GitBucket.

Plugin version | GitBucket version
:--------------|:--------------------
1.0.0        | 4.38.x

## Features

The current version of this plugin provides a dark theme for GitBucket (compatibibity with others plugins too). It takes effect when the web browser is in dark mode too.

## Build from source

Run `sbt assembly` and copy generated `/target/scala-2.13/gitbucket-dark-mode-plugin-x.x.x.jar` to `~/.gitbucket/plugins/` (If the directory does not exist, create it by hand before copying the jar), or just run `sbt install`.
