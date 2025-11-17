import style from "./index.module.css";

function MoneyInput() {
  return (
    <div className={style.moneySection}>
      <label className={style.moneyBox}>
        <input className={style.moneyInput} id="money" type="text" />
      </label>
      <button className={style.purchaseBtn}>구매</button>
    </div>
  );
}

export default MoneyInput;
