# sample-library

## ディレクトリ作成

ここの名前がライブラリ名になる

```
mkdir sample-library
```

## ひな形作成

Gradle がない場合は Android Studio から作成してもいい

```
./gradlew init --type java-library
```

## ライブラリの作成

HelloWorld.java を作る

## Maven Upload Script

```
apply plugin: 'maven'

def repo = new File(rootDir, 'repository')

uploadArchives {
  repositories {
      mavenDeployer {
          repository url: "file://${repo.absolutePath}"
          pom.version = '0.0.2'
          pom.groupId = 'in.tanjo.modeling'
          pom.artifactId = 'modeling'
      }
  }
}
```

## jar の生成

```
./gradlew clean 
./gradlew build
./gradlew uploadArchives
```

or

```
./gradlew clean build uploadArchives 
```

## 使い方

```
repositories {
    maven {
        url 'https://raw.githubusercontent.com/tanjo/java-sample-library/master/repository/'
    }
}
 
dependencies {

    implementation 'in.tanjo.modeling:modeling:0.0.3'

    // (略)
}
```

