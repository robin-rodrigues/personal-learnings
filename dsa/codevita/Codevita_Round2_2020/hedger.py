#Public cases: All cases
#Private cases: TLE

import re 

m_s = []
m_c = []
m_p = []
ct = 0
res = 0

s = re.findall(r"[-+]?\d*\.\d+|\d+",input())
c = re.findall(r"[-+]?\d*\.\d+|\d+",input())
p = re.findall(r"[-+]?\d*\.\d+|\d+",input())

def market_cal(m_s,m_c,m_p,ct,res):
   max_i = m_p.index(max(m_p))
   maximum_val = m_c[max_i]
   for _ in range(int(m_s[1])):
       if m_s[2] > ct and m_s[2]>=ct + maximum_val:
           ct = ct + maximum_val
           res = res + ((maximum_val * m_p[max_i]) / 100)
       else:
           print(int(res))
           return res
   m_p.pop(max_i)
   m_c.pop(max_i)
   market_cal(m_s,m_c,m_p,ct,res)



for x in s:
   m_s.append(float(x))
for x in c:
   m_c.append(float(x))
for x in p:
   m_p.append(float(x))

val = market_cal(m_s,m_c,m_p,ct,res)