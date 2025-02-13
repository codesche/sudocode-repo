
// 주몽
갑옷을 만드는 재료는 고유의 번호
두 개의 재료 => 고유한 번호를 합쳐서 M이 되면 갑옷을 만든다
갑옷을 몇 개나 만들 수 있는지를 확인

N개의 재료
갑옷을 만드는 데 필요한 수
N개의 재료들이 가진 고유한 번호들 (공백 있음)

br.readLine();
br.readLine();
StringTokenizer st = new StringTokenizer();
int[] arr = Integer.parseInt(st.nextToken());

// 정렬과 투 포인터를 활용하여 두 수가 M보다 작거나 크거나 같을 때를 고려하여 count를 증가시켜주면 끝
1 2 3 4 5 7