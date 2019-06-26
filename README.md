# Modified Tanimoto distance measure for Knime

[![Build Status](https://travis-ci.org/3D-e-Chem/knime-modified-tanimoto.svg)](https://travis-ci.org/3D-e-Chem/knime-modified-tanimoto)
[![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.3257714.svg)](https://doi.org/10.5281/zenodo.3257714)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=nl.esciencecenter.e3dchem%3Anl.esciencecenter.e3dchem&metric=alert_status)](https://sonarcloud.io/dashboard?id=nl.esciencecenter.e3dchem%3Anl.esciencecenter.e3dchem)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=nl.esciencecenter.e3dchem%3Anl.esciencecenter.e3dchem&metric=coverage)](https://sonarcloud.io/dashboard?id=nl.esciencecenter.e3dchem%3Anl.esciencecenter.e3dchem)

KNIME plugin for calculating distance of bitvectors using Modifed Tanimoto similarity index.
Implements similarity index according to Fligner, Michael A., et al. “A Modification of the Jaccard-Tanimoto Similarity Index for Diverse Selection of Chemical Compounds Using Binary Strings.” Technometrics, vol. 44, no. 2, 2002, pp. 110–119. https://www.jstor.org/stable/1271255

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

See example workflow in [examples](examples) folder.

# Build

```
mvn verify
```

Jar has been made in `nl.esciencecenter.e3dchem.modifiedtanimoto/target` folder.
An Eclipse update site will be made in `nl.esciencecenter.e3dchem.p2/target/repository` repository.

# Development

Steps to get development environment setup based on https://github.com/knime/knime-sdk-setup#sdk-setup:

1. Install Java 8
2. Install Eclipse for [RCP and RAP developers](https://www.eclipse.org/downloads/packages/release/2018-12/r/eclipse-ide-rcp-and-rap-developers)
3. Configure Java 8 inside Eclipse Window > Preferences > Java > Installed JREs
4. Import this repo as an Existing Maven project
5. Activate target platform by going to Window > Preferences > Plug-in Development > Target Platform and check the `KNIME Analytics Platform (4.0) - nl.esciencecenter.e3dchem.knime.sstea.targetplatform/KNIME-AP-4.0.target` target definition.

During import the Tycho Eclipse providers must be installed.

## Tests

Tests for the node are in `tests/src` directory.
Tests can be executed with `mvn verify`, they will be run in a separate Knime environment.

### Unit tests

Unit tests written in Junit4 format can be put in `nl.esciencecenter.e3dchem.modifiedtanimoto.tests/src/java`.

### Workflow tests

See https://github.com/3D-e-Chem/knime-testflow#3-add-test-workflow

# New release

1. Update versions in pom files with `mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=<version>-SNAPSHOT` command.
2. Commit and push changes
3. Create package with `mvn package`, will create update site in `nl.esciencecenter.e3dchem.p2/target/repository`
4. Append new release to 3D-e-Chem update site
  1. Make clone of https://github.com/3D-e-Chem/3D-e-Chem.github.io repo
  2. Append release to 3D-e-Chem update site with `mvn install -Dtarget.update.site=<3D-e-Chem repo/updates>`
5. Commit and push changes in this repo and 3D-e-Chem.github.io repo
6. Make nodes available to 3D-e-Chem KNIME feature by following steps at https://github.com/3D-e-Chem/knime-node-collection#new-release

