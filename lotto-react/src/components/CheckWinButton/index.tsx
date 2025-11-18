import { checkWinLotto } from "../../api/lottoApi";
import useLottoStore from "../../store/useLottoStore";
import style from "./index.module.css";

function CheckWinButton() {
  const lottos = useLottoStore((state) => state.lottos);

  const checkWinResult = async () => {
    const result = await checkWinLotto(lottos);

    console.log(result);
  };

  return (
    <div className={style.container}>
      <button className={style.winBtn} onClick={checkWinResult}>
        당첨 확인
      </button>
    </div>
  );
}

export default CheckWinButton;
