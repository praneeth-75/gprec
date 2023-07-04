
import pandas as pd

data = {
    'Name': ['Alice', 'Bob', 'Charlie', 'David', 'Eva'],
    'Age': [25, 30, None, 22, 28],
    'City': ['New York', 'London', 'Paris', None, 'Berlin']
}

df = pd.DataFrame(data)
print(df)
df=df.dropna()
print(df)
df['Age']=pd.to_numeric(df['Age'], errors ="coerce")
print(df)
print(df.dtype)

a= {
    'id' : [1,2,3],
    'names ' : ["jai",'shree','Ram']
}
c=pd.DataFrame(a)
print(c)
b={
    'id': [2,3,4],
    'names': ["Har","Hara","Mahadev"]
}
d=pd.DataFrame(b)
print(d)

merge= pd.merge(c,d,on='id',how='inner')
print(merge)


data={
    'product':['A','B','A','B','A','B'],
    'Amount':[100,150,200,110,120,160]
}
data1=pd.DataFrame(data)
print(data1)
g=data1.groupby('product')['Amount'].sum()
print(g)
