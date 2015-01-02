@echo off

set line=------------------------------------------------------------------

ECHO %line%
ECHO FEMTO UPDATER
ECHO %line%
ECHO.
ECHO This script requires git to be accessible from the commandline. If you do not know how to do that, you can check out Git Gui for Windows.
ECHO.
ECHO If this script does not work after a while, delete the libs folder.
ECHO.
PAUSE
IF EXIST libs GOTO LIBS
ECHO.
ECHO The directory libs does not exist. Creating it.
MKDIR libs
ECHO.
CD libs 
ECHO Grabbing Femtocraft
ECHO.
git clone https://github.com/Itszuvalex/Femtocraft.git -b develop-1.7.10 --single-branch
GOTO END
:LIBS

CD libs/Femtocraft
ECHO.
git pull
ECHO.

GOTO END
:END
PAUSE
