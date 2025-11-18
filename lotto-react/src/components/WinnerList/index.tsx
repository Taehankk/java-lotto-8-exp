import useLottoStore from "../../store/useLottoStore";
import Winner from "../Winner";
import style from "./index.module.css";

function WinnerList() {
  const winnerList = useLottoStore((state) => state.lottosResult);

  return (
    <div className={style.container}>
      <h3>당첨 결과</h3>
      <div className={style.winnerList}>
        {winnerList && winnerList.length > 0
          ? winnerList.map((winner, index) => (
              <Winner key={index + "winner"} result={winner} />
            ))
          : ""}
      </div>
    </div>
  );
}

export default WinnerList;
