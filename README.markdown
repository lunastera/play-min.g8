# play-min.g8

## Usage

```
$ sbt new sobreera/play-min.g8
```

## Properties

`name`:  
Project name.  
This property is used for the root directory name, package name and build.sbt.

`organization`:  
This property is used for package name.

`enable_packaged`:  
If you set this property to "Yes", packages will be created based on `organization` and` name`.  
The default is set to "No".

`scala_version`:  
The default is set to "2.12.8".

`play_version`:  
The default is set to "2.7.0".
