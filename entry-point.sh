#!/bin/bash
if [[ "$XAUTH" != "" ]]
then
    xauth add $XAUTH
else
    echo "No thing passed to XAUTH."
fi

java -jar XYZ-1.0.jar