# Project Title
Unit Converter Android App

## Purpose of project
* Getting familiar with using Android Studio and XML along with Java
* Learning how to use spinners and how to manage inputs and outputs more smoothly
* Practice using additional classes in an android app project

## Description
This project is a simple length unit converter. It displays results with a 5 decimal places accuracy.

## Built with
Android Studio

## Source
Tha base code is inspired by the following guide:
https://androidkennel.org/unit-converter-android-tutorial/

## Personal changes
* Added Millimeter unit
* Changed the way you convert units. Instead of directly converting from unit A to unit B, unit A is first converted to the largest unit of that family (either Km or mi.) then converted to unit B.
This reduces the amount of code written thus saving memory
* Added formatting to prevent results from being displayed in scientific notation

## Planned Future Improvements
* Expand app to include other measurment units (ie mass,temperature,electricity,etc)
* Further precision improvements
* UI improvement
