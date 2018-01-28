#!/bin/sh

git checkout master
git add .
git commit -am "Updated Program"
git push
git rm --cached Train
echo Press Enter...
