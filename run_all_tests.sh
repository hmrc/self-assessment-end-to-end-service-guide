#!/usr/bin/env bash

sbt clean scalafmtAll compile test dependencyUpdates
