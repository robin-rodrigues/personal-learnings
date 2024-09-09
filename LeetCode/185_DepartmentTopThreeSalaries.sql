select
      d.name as Department,
      e.name as Employee,
      e.salary as Salary
from
      Employee e
      join Department d on e.departmentId = d.id
      join (
            select
                  distinct e_sub.departmentId,
                  e_sub.salary,
                  dense_rank() over(
                        partition by e_sub.departmentId
                        order by
                              e_sub.salary desc
                  ) as rank_n
            from
                  Employee e_sub
      ) sub on e.salary = sub.salary
      and d.id = sub.departmentId
      and sub.rank_n between 1
      and 3;