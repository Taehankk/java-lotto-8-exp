import style from "./index.module.css";

interface Props {
  result: string;
}

function Winner({ result }: Props) {
  return (
    <div className={style.winner}>
      <p className={style.content}>{result}</p>
    </div>
  );
}

export default Winner;
