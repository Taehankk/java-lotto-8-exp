import style from "./index.module.css";

import LottoList from "../LottoList";
import WinnerList from "../WinnerList";
import useLottoStore from "../../store/useLottoStore";

function ResultSection() {
  const result = useLottoStore((state) => state.lottosResult);

  return (
    <div className={style.container}>
      <LottoList />
      {result && result.length > 0 ? <WinnerList /> : ""}
    </div>
  );
}

export default ResultSection;
