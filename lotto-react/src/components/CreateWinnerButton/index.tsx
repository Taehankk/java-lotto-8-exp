import style from "./index.module.css";

function CreateWinnerButton() {
  return (
    <div className={style.container}>
      <button className={style.createWinnerBtn}>1등 뽑기</button>
    </div>
  );
}

export default CreateWinnerButton;
