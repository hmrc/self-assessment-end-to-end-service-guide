#!/usr/bin/env bash

sbt scalafmtAll scalastyleAll clean compile test dependencyUpdates
