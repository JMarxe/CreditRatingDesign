# Credit Rating Design

Application for an investment company that needs to categorize investment opportunities for sovereign debt (i.e., debt owed by a central government, such as US Treasury Bonds), and assign credit ratings based on the country's financial attributes, and related information.

This assignment is based loosely on the following research paper: Constantin Mellios & Eric Paget-Blanc (2006) Which factors determine sovereign credit ratings?, The European Journal of Finance, 12:4, 361-377,DOI:[10.1080/13518470500377406](https://doi.org/10.1080/13518470500377406)

The table below summarizes the data used to describe countries:

| Country Descriptor Name | Input Type | Range of Expected Values | Description |
| --- | --- | --- | --- |
| Per-capita income | Integer | 681 to 124,927 | How much income does the average person in the country earn? |
| Tax revenue as a percentage of GDP | Double | 1.4% to 75.82% | How much of a country's income comes from taxes? |
| Inflation rate | Double | -2.5 to 4,000,000 | Rate of change of prices in a country |
| Variability of exchange rate | Text | Low, Medium, High | How widely does the countrys exchange rate vary? |
| History of default | Text | Yes or No | Has the country defaulted on debt in the past? |
| Corruption Perception Index score | Integer | 100 (fully transparent) to 0 (fully corrupt) | Index of a country's transparency and governance structures |

The inputs into the application are data points describing the country, and the output is a three-character credit rating. The relevant decision tree is given in the figure below:

<p align="center">
<img src="https://user-images.githubusercontent.com/114123232/221914121-ed96a107-884f-4fb7-8c4b-d7d2efb7101f.png"/>
<br />
