select
    MCDP_CD as '진료과 코드'
    , count(*) as '5월예약건수'
#    , APNT_YMD
from APPOINTMENT
where concat(year(APNT_YMD),month(APNT_YMD)) = '20225'
group by mcdp_cd
order by COUNT(MCDP_CD) ASC, MCDP_CD ASC