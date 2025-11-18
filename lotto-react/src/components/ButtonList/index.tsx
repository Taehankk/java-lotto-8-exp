import style from "./index.module.css";

import CheckWinButton from "../CheckWinButton";
import CreateWinnerButton from "../CreateWinnerButton";

function ButtonList() {
  return (
    <div className={style.container}>
      <CreateWinnerButton />
      <CheckWinButton />
    </div>
  );
}

export default ButtonList;
