import { createWinnerLotto } from "../../api/lottoApi";
import style from "./index.module.css";

function CreateWinnerButton() {
  const createWinner = async () => {
    const result = await createWinnerLotto();

    console.log(result);
  };

  return (
    <div className={style.container}>
      <button className={style.createWinnerBtn} onClick={createWinner}>
        1등 뽑기
      </button>
    </div>
  );
}

export default CreateWinnerButton;
