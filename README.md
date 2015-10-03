# Modified Tanimoto distance measure for Knime

[![Build Status](https://travis-ci.org/3D-e-Chem/knime-modified-tanimoto.svg)](https://travis-ci.org/3D-e-Chem/knime-modified-tanimoto)

Knime plugin for calculating distance of bitvector using Modifed Tanimoto similarity index.

Followed http://tech.knime.org/wiki/distance-measure-developers-guide for this repo. 

# Installation

Requirements:

* KNIME, https://www.knime.org
* KNIME Distance Matrix feature, if missing see development chapter step 4  

Steps to get distance measure inside KNIME:

1. Goto last release at https://github.com/3D-e-Chem/knime-modified-tanimoto/releases
2. Download jar file
3. Copy jar file to dropins/ folder inside KNIME installation.

# Usage

The Modified Tanimoto distance measure can be selected inside the `Bit Vector Distances` node.

For description of distance measurement framework see http://tech.knime.org/wiki/distance-measure 

# Build

```
mvn verify
```

Jar has been made in `nl.esciencecenter.e3dchem.modifiedtanimoto/target` folder.

# Development

Steps to get development enviroment setup:

1. Download KNIME SDK from https://www.knime.org/downloads/overview
2. Install/Extract/start KNIME SDK
3. Start SDK
4. Install distance matrix nodes + m2e (Maven integration for Eclipse)

    1. Goto Help > Install new software ...
    2. Select --all sites-- in work with pulldown
    3. Open KNIME & Extensions folder
    4. Select KNIME Distance Matrix
    5. Open General Purpose Tools folder
    6. Select m2e (Maven integration for Eclipse)
    7. Install sofware & restart

5. Import this repo as a Maven project

During import the Tycho Eclipse providers must be installed.

