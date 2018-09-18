#!/usr/bin/env bash

# Post Build Script

set -e # Exit immediately if a command exits with a non-zero status (failure)

echo "**************************************************************************************************"
echo "Post Build Script"
echo "**************************************************************************************************"

##################################################
# Start UI Tests
##################################################


appcenter test run espresso --app "shivendratiwari81-lmt0/HelloAppCenterAndroid" --devices 249b175a --app-path ./build/outputs/apk/debug/app-debug.apk  --test-series "master" --locale "en_US" --build-dir ./build/outputs/apk/androidTest/debug/


echo ""
echo "**************************************************************************************************"
echo "Post Build Script complete"
echo "**************************************************************************************************"


