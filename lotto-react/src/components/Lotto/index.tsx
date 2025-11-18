import style from "./index.module.css";

interface Props {
  lotto: number[];
}

function Lotto({ lotto }: Props) {
  return (
    <div className={style.lotto}>
      {lotto.map((num, index) => (
        <span key={index + "num"} className={style.lottoNumber}>
          {num}
        </span>
      ))}
    </div>
  );
}

export default Lotto;
