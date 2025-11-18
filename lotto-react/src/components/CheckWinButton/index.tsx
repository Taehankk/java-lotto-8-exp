import { checkWinLotto } from "../../api/lottoApi";
import useLottoStore, { WinnerLabel } from "../../store/useLottoStore";
import style from "./index.module.css";

function CheckWinButton() {
  const lottos = useLottoStore((state) => state.lottos);
  const setResult = useLottoStore((state) => state.setLottosResult);

  const checkWinResult = async () => {
    const result: string[] = await checkWinLotto(lottos);

    setResult(result);
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
