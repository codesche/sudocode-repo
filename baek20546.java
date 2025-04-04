// 기적의 매매법 - 실버 5

/*
준현이
// 한 번 산 주식은 절대 팔지 않는다.
// BNP = Buy and Pray
// 주식을 살 수 있다면 가능한 만큼 즉시 매수
// 무조건 사고 존버하는 성향
 */

 /*
  * 성민이 - 주식이 타이밍 싸움
  33매매법 
  1. 전량 매수, 전량 매도로 이루어짐
  => 현금: 100원, 주가: 11원 - 99원 어치 매수
  => 빚을 내서 주식을 하지는 않음 (매수량이 현금보다 많으면 안 됨!)
  2. 3일 연속 가격이 전일 대비 상승하는 주식 -> 다음 날 무조건 가격이 하락한다고 가정
  - 소유 주식의 가격이 3일 상승한다면, 전량 매도 (이전 날과 다음 날을 비교했을 때 다음 날의 가격이 크다면 상승한 것으로 간주)
  - 전일과 오늘의 주가가 동일하다면 가격이 하락한 것이 아님
  3. 3일 연속 가격이 전일 대비 하락하는 주식 -> 다음 날 무조건 가격이 상승한다고 가정
  - 소유 주식의 가격이 3일 하락한다면, 전량 매수 (이전 날과 다음 날을 비교했을 때 다음 날의 가격이 작다면 하락한 것으로 간주)
  */

// 준현이, 성민이는 각자의 매매법 중 어떤 방법이 더 수익률이 높은지 겨뤄봄
// 내기 기간: 2021. 1. 1 ~ 2021. 1. 14
// 2021. 1. 14일에 더 많은 자산을 보유한 사람이 승리
// 1월 14일 자산 = 현금 + (1/14일 주가 x 주식 수)

// == 출력 결과 ==
// 준현이의 자산이 더 크다 : BNP
// 성민이의 자산이 더 크다 : TIMING
// 둘의 자산이 같다 : SAMESAME 

// 변수: 현금(cash), 주가(stockPrice), 매수 가능 주식 수(saleStock), 매수 여부(check), 보유 주식 수(currentStock)