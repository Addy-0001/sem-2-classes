import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
#Loading the dataset.
df = pd.read_csv('AirlineReviews.csv')

# Convert 'DateFlown' to datetime with the appropriate format
df['DateFlown'] = pd.to_datetime(
    df['DateFlown'], errors='coerce', format='%b-%y')

plt.plot(df['EntertainmentRating'].head(70), label="Entertainment Rating")
plt.plot(df['OverallScore'].head(70), label="Overall Score")
plt.title('Flight Overall Score Vs. Flight Entertainment Rating')
plt.xticks(rotation=45)
plt.show()

sns.histplot(df['OverallScore'], bins=30, kde=True, color='blue', edgecolor='black')
plt.xlabel('Overall Score')
plt.ylabel('Frequency')
plt.title('Distribution of Overall Scores')
plt.show()

sns.boxplot(x='CabinType', y='SeatComfortRating', data=df)
plt.xlabel('Cabin Type')
plt.ylabel('Seat Comfort Rating')
plt.title('Seat Comfort Rating by Cabin Type')
plt.show()



sns.barplot(x='TravelType', y='OverallScore', data=df)
plt.xlabel('Travel Type')
plt.ylabel('Overall Score')
plt.title('Overall Score by Travel Type')
plt.show()

travel_type_counts = df['TravelType'].value_counts()
plt.pie(travel_type_counts, labels=travel_type_counts.index,
        autopct='%1.1f%%', startangle=90)
plt.title('Distribution of Travel Types')
plt.show()
