# Modified Tanimoto distance measure for Knime

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

# Development

Steps to get development enviroment setup:

1. Download KNIME SDK from https://www.knime.org/downloads/overview
2. Install/Extract KNIME SDK
3. Start SDK
4. Install distance matrix nodes

    1. Goto Help > Install new software ...
    2. Select --all sites-- in work with pulldown
    3. Open KNIME & Extensions folder
    4. Select KNIME Distance Matrix
    5 Install sofware & restart

5. Import this repo as Eclipse plugin

Install eGit provider if needed. 

