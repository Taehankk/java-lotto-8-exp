import { useState, type ChangeEvent } from "react";
import style from "./index.module.css";
import { getLottos } from "../../api/lottoApi";

function MoneyInput() {
  const [money, setMoney] = useState<number>(0);

  const changeMoney = (e: ChangeEvent<HTMLInputElement>) => {
    setMoney(Number(e.target.value));
  };
  const purchaseLotto = async () => {
    const data = await getLottos(money);
    console.log(data);
  };

  return (
    <div className={style.moneySection}>
      <label className={style.moneyBox}>
        <input
          className={style.moneyInput}
          id="money"
          type="text"
          value={money}
          onChange={changeMoney}
        />
      </label>
      <button className={style.purchaseBtn} onClick={purchaseLotto}>
        구매
      </button>
    </div>
  );
}

export default MoneyInput;
