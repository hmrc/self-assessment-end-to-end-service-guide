#!/usr/bin/env bash

sbt scalafmtAll scalastyleAll clean compile Test/test dependencyUpdates
