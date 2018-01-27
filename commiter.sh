#!/bin/sh
watch test -N "C:\Users\grant\eclipse-workspace"
git checkout master
git add .
git commit -am "Updated Program"
git push
git rm --cached Train
echo Press Enter...
