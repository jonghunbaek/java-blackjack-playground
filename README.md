## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
```
- UI구현
- 플레이어, 딜러, 카드, 블랙잭 게임
- 플레이어 베팅 금액 저장
- 1~12의 랜덤 숫자생성(A == 1 or 11 , 10 == jack, 11 == queen, 12 == king)
- 카드 이름, 값 중복 확인(A스페이드가 두개 존재할 수 없음)
- 게임시작시 2장의 카드 제공, 21을 초과하지 않으면 원하는 경우 카드 계속 뽑기 가능(추가 뽑기 후 21초과 시 배팅금액 잃음)
- 첫 두장의 합이 21일 경우 배팅금액*1.5를 돌려 받음(딜러, 플레이어 모두 처음 21인 경우 플레이어는 배팅금액 돌려받음)
- 딜러는 처음 2장이 16이하일 경우 반드시 1장을 추가로 받아야하고 17이상이면 추가로 받을 수 없음(21초과시 플레이어는 베팅금액 돌려받음)
```