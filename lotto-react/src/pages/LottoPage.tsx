import CheckWinButton from "../components/CheckWinButton";
import LottoList from "../components/LottoList";
import MoneyInput from "../components/MoneyInput";
import Title from "../components/Title";

function LottoPage() {
  return (
    <div>
      <Title />
      <MoneyInput />
      <LottoList />
      <CheckWinButton />
    </div>
  );
}

export default LottoPage;
