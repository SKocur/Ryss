@echo off

::It used to execute .rx apps with double-click on Windows

SET main_path=%~dp0
java -jar "%main_path%Ryss.jar" %1