import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
# load the fifa dataset, downloaded from kaggle
fifa = pd.read_csv("fifa_eda.csv")


sns.set(style="whitegrid")

# line chart
plt.figure(figsize=(10, 5))
plt.plot(fifa['Age'], label="Age")  # Plotting the line chart for player ages
# Adding another line for demo - added overall
plt.plot(fifa['Overall'], label="Overall")
plt.title("Line Chart Example")
# plt.xlabel("Player Index")
# plt.ylabel("Value")
plt.legend()
plt.show()

# Pie Chart example
plt.figure(figsize=(8, 8))
# Creating a pie chart for the top 5 nationalities in the fifa dataset
plt.pie(fifa['Nationality'].value_counts().head(
    5), labels=fifa['Nationality'].value_counts().head(5).index, autopct='%1.2f%%', startangle=90)
plt.title('Top 5 Nationalities in the fifa dataset')
plt.show()

# Histogram example
plt.figure(figsize=(8, 8))
# Plotting a histogram for the age distribution in the fifa dataset using seaborn
sns.histplot(fifa['Age'], bins=30, kde=True, color='blue')
plt.title('Histogram Example, Fifa 19 Dataset')
plt.xlabel("Age")
plt.ylabel('Frequency')
plt.show()


# Box Plot Example
plt.figure(figsize=(8, 8))
# Creating a box plot for the overall rating based on the preferred foot in the fifa dataset
sns.boxplot(x='Preferred Foot', y='Overall', data=fifa, palette='Set2')
plt.title("Box Plot Example, Fifa 19 Dataset")
plt.xlabel('Preferred Foot')
plt.ylabel("Overall")
plt.show()


# Linear Regression Example
plt.figure(figsize=(8, 8))
# Creating a scatter plot with a linear regression line for the relationship between age and overall Rating
sns.regplot(x='Age', y='Overall', data=fifa, scatter_kws={
            'alpha': 0.3}, line_kws={'color': 'red'})
plt.title('Linear Regression, Fifa 19 Dataset')
plt.xlabel('Age')
plt.ylabel('Overall Rating')
plt.show()


# Making a heatmap that tracks the overall of the players in the dataset.
data = (fifa['Overall'],)
sns.heatmap(data, center=50)
plt.title("Heatmap on overall and age")
plt.show()
