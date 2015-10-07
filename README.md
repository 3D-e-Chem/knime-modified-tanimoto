# Modified Tanimoto distance measure for Knime

[![Build Status](https://travis-ci.org/3D-e-Chem/knime-modified-tanimoto.svg)](https://travis-ci.org/3D-e-Chem/knime-modified-tanimoto)

Knime plugin for calculating distance of bitvectors using Modifed Tanimoto similarity index.

Followed http://tech.knime.org/wiki/distance-measure-developers-guide for this repo. 

# Installation

Requirements:

* KNIME, https://www.knime.org

Steps to get distance measure inside KNIME:

1. Goto Help > Install new software ... menu
2. Press add button
3. Fill text fields with `https://3d-e-chem.github.io/updates`
4. Select --all sites-- in work with pulldown
5. Open KNIME 3D-e-Chem Contributions folder
6. Select Modified Tanimoto Distance measure
7. Install sofware & restart

# Usage

The Modified Tanimoto distance measure can be selected inside the `Bit Vector Distances` node.

For description of distance measurement framework see http://tech.knime.org/wiki/distance-measure 

# Build

```
mvn verify
```

Jar has been made in `nl.esciencecenter.e3dchem.modifiedtanimoto/target` folder.
An Eclipse update site will be made in `nl.esciencecenter.e3dchem.p2/target/repository` repository.

# Development

Steps to get development enviroment setup:

1. Download KNIME SDK from https://www.knime.org/downloads/overview
2. Install/Extract/start KNIME SDK
3. Start SDK
4. Install distance matrix nodes + m2e (Maven integration for Eclipse)

    1. Goto Help > Install new software ...
    2. Make sure Update site is http://update.knime.org/analytics-platform/2.12 in the pull down list otherwise add it
    3. Select --all sites-- in work with pulldown
    4. Open KNIME & Extensions folder
    5. Select KNIME Distance Matrix
    6. Open General Purpose Tools folder
    7. Select m2e (Maven integration for Eclipse)
    8. Install sofware & restart

5. Import this repo as an Existing Maven project

During import the Tycho Eclipse providers must be installed.

# New release

1. Update versions in pom files with `mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=<version>` command.
2. Manually update version of "source" feature in `nl.esciencecenter.e3dchem.p2/category.xml` file.
3. Commit and push changes
3. Create package with `mvn package`
4. Make clone of https://github.com/3D-e-Chem/3D-e-Chem.github.io repo
5. Copy `nl.esciencecenter.e3dchem.p2/target/repository` to `3D-e-Chem.github.io/updates`
6. Commit and push changes in this repo and 3D-e-Chem.github.io repo
