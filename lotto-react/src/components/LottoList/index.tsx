import style from "./index.module.css";

import useLottoStore from "../../store/useLottoStore";
import Lotto from "../Lotto";

function LottoList() {
  const lottos = useLottoStore((state) => state.lottos);

  return (
    <div className={style.container}>
      <h3>구매 리스트</h3>
      <div className={style.lottoList}>
        {lottos && lottos.length > 0 ? (
          lottos.map((lotto, index) => (
            <div key={index}>
              <Lotto lotto={lotto} />
            </div>
          ))
        ) : (
          <h4>로또를 구매해주세요</h4>
        )}
      </div>
    </div>
  );
}

export default LottoList;
