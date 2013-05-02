## ohjelmoinnin harjoitustyö kevät 2013
Tämä on peli jossa lennetään lentokoneella... eikä mitään muuta tapahdu vielä tässä vaiheessa.
Peli käyttää slick2d ja lwjgl -kirjastoja
http://www.slick2d.org/
http://www.lwjgl.org/

## Asennus
Asenna Gradle (www.gradle.org)

Pelin asennus:
```
git clone https://github.com/jkarenko/ohha.git
cd ohha
cd seuss-game
gradle build
cd ..
```

Unzippaa seuss-game.jar ja sen jälkeen käynnistä peli komennolla
```
java -jar seuss-game.jar
```

Pelaaminen

|näppäin|toiminto|
|---:|:---|
|w|kaasu|
|s|jarru|
|a|nokka ylös|
|d|nokka alas|
|esc|lopetus|

Voit ladata pelin myös tästä: https://dl.dropboxusercontent.com/u/393119/seuss-game.jar
