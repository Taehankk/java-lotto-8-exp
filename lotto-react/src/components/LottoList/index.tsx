import useLottoStore from "../../store/useLottoStore";
import Lotto from "../Lotto";

function LottoList() {
  const lottos = useLottoStore((state) => state.lottos);

  return (
    <div>
      <h3>구매 리스트</h3>
      {lottos && lottos.length > 0 ? (
        lottos.map((lotto: number[]) => <Lotto />)
      ) : (
        <h4>로또를 구매해주세요</h4>
      )}
    </div>
  );
}

export default LottoList;
