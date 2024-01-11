import pandas as pd
import matplotlib.pyplot as plt

category = ["Apple", "Mango", "Orange"]
values = [10, 14, 12]

plt.figure(figsize=(4, 4))
plt.bar(category, values, color='skyblue')
plt.show()

plt.figure(figsize=(4, 4))
plt.pie(values, labels=category, autopct='%1.1f%%',
        startangle=90, colors=["lightblue", "red", 'lightgreen'])
plt.title("Pie Chart of above example")
plt.show()

plt.plot(category, values, marker='s', linestyle="-")
plt.show()
