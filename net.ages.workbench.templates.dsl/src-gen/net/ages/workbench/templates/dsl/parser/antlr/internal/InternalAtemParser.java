package net.ages.workbench.templates.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.ages.workbench.templates.dsl.services.AtemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAtemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Template'", "'End-Template'", "'Head'", "'End_Head'", "'Generation_Driver'", "'Service_Regular_Expression'", "'Service_Status'", "'End_Generation_Driver'", "'Template_Title'", "'End_Title'", "'Page_Keep_With_Next'", "'End_Page_Keep_With_Next'", "'Page_Header_Even'", "'End_Page_Header_Even'", "'Page_Header_Odd'", "'End_Page_Header_Odd'", "'Page_Footer_Even'", "'End_Page_Footer_Even'", "'Page_Footer_Odd'", "'End_Page_Footer_Odd'", "'left'", "'center'", "'right'", "'@text'", "'@date'", "'lang'", "'@pageNbr'", "'@lookup'", "'@title'", "'@commemoration'", "'Template_Commemoration'", "'End_Template_Commemoration'", "'Status'", "'.'", "'.*'", "'import'", "'Switch-Version'", "'End-Switch-Version'", "'sid'", "'media-off'", "'rid'", "'@mode'", "'@day'", "'ldp'", "'<'", "'>'", "'</>'", "'Info'", "'End-Info'", "'Set_Date'", "'month'", "'day'", "'year'", "'End_Date'", "'Preface'", "'End-Preface'", "'Section'", "'role'", "'End-Section'", "'@All_Liturgical_Day_Properties'", "'@Service_Date'", "'@Service_Year'", "'@Day_of_Movable_Cycle'", "'@Mode_of_Week'", "'@Name_of_Period'", "'@Day_of_Month'", "'@Day_of_Period'", "'@Day_of_Week_As_Number'", "'@Day_of_Week_As_Text'", "'@Eothinon'", "'@Sunday_After_Elevation_Cross_Date'", "'@Lukan_Cycle_Start_Date'", "'@Lukan_Cycle_Elapsed_Days'", "'@Lukan_Cycle_Week'", "'@Lukan_Cycle_Week_Day'", "'@Sundays_Before_Triodion'", "'Insert_template'", "'End-Insert'", "'Insert_section'", "'Break'", "'End_Break'", "'Set_Page_Number'", "'End_Set_Page_Number'", "'Passthrough-Html'", "'END-Passthrough-Html'", "'END-Passthrough-Pdf'", "'Title'", "'End-Title'", "'Sub-Title'", "'End-Sub-Title'", "'Para'", "'End-Para'", "'bTag'", "'End-bTag'", "'Hymn'", "'End-Hymn'", "'Media'", "'End-Media'", "'Verse'", "'End-Verse'", "'Actor'", "'End-Actor'", "'Rubric'", "'End-Rubric'", "'Dialog'", "'End-Dialog'", "'Reading'", "'End-Reading'", "'Heading_1'", "'End_Heading_1'", "'Heading_2'", "'End_Heading_2'", "'Heading_3'", "'End_Heading_3'", "'AGES_ID'", "'Version'", "'LiturgicalBook'", "'Set_Locale'", "'locale_1'", "'locale_2'", "'End_Set_Locale'", "'@restoreLocale'", "'when-date-is'", "'end-when'", "'use:'", "'thru'", "','", "'when-name-of-day-is'", "'when-pentecostarion-day-is'", "'when-triodion-day-is'", "'when-movable-cycle-day-is'", "'when-Sunday-after-Elevation-of-Cross-is'", "'when-Lukan-Cycle-Day-is'", "'when-pascha use:'", "'otherwise use:'", "'when-mode-of-week-is'", "'when-sundays-before-triodion-is'", "'when-exists'", "'L1'", "'L2'", "'Both'", "'line'", "'page'", "'NA'", "'Draft'", "'Review'", "'Final'", "'M1'", "'M2'", "'M3'", "'M4'", "'M5'", "'M6'", "'M7'", "'M8'", "'D1'", "'D2'", "'D3'", "'D4'", "'D5'", "'D6'", "'D7'", "'Sunday'", "'Monday'", "'Tuesday'", "'Wednesday'", "'Thursday'", "'Friday'", "'Saturday'", "'Jan'", "'Feb'", "'Mar'", "'Apr'", "'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'"
    };
    public static final int RULE_ID=5;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__90=90;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int T__95=95;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__141=141;
    public static final int T__84=84;
    public static final int T__142=142;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__140=140;
    public static final int T__89=89;
    public static final int T__145=145;
    public static final int T__88=88;
    public static final int T__146=146;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int RULE_STRING=4;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__129=129;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__130=130;
    public static final int T__73=73;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__133=133;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__77=77;
    public static final int T__135=135;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__184=184;
    public static final int T__43=43;
    public static final int T__183=183;
    public static final int T__40=40;
    public static final int T__186=186;
    public static final int T__41=41;
    public static final int T__185=185;
    public static final int T__46=46;
    public static final int T__188=188;
    public static final int T__47=47;
    public static final int T__187=187;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__189=189;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__175=175;
    public static final int T__30=30;
    public static final int T__174=174;
    public static final int T__31=31;
    public static final int T__173=173;
    public static final int T__32=32;
    public static final int T__172=172;
    public static final int T__33=33;
    public static final int T__179=179;
    public static final int T__34=34;
    public static final int T__178=178;
    public static final int T__35=35;
    public static final int T__177=177;
    public static final int T__36=36;
    public static final int T__176=176;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int RULE_WS=9;
    public static final int T__169=169;

    // delegates
    // delegators


        public InternalAtemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAtemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAtemParser.tokenNames; }
    public String getGrammarFileName() { return "../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g"; }



     	private AtemGrammarAccess grammarAccess;
     	
        public InternalAtemParser(TokenStream input, AtemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AtemModel";	
       	}
       	
       	@Override
       	protected AtemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAtemModel"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:68:1: entryRuleAtemModel returns [EObject current=null] : iv_ruleAtemModel= ruleAtemModel EOF ;
    public final EObject entryRuleAtemModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtemModel = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:69:2: (iv_ruleAtemModel= ruleAtemModel EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:70:2: iv_ruleAtemModel= ruleAtemModel EOF
            {
             newCompositeNode(grammarAccess.getAtemModelRule()); 
            pushFollow(FOLLOW_ruleAtemModel_in_entryRuleAtemModel75);
            iv_ruleAtemModel=ruleAtemModel();

            state._fsp--;

             current =iv_ruleAtemModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtemModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtemModel"


    // $ANTLR start "ruleAtemModel"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:77:1: ruleAtemModel returns [EObject current=null] : (otherlv_0= 'Template' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )? ( (lv_dsl_Template_head_5_0= ruleHead ) )? ( (lv_dsl_Template_preface_6_0= rulePreface ) )? ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )* otherlv_8= 'End-Template' ) ;
    public final EObject ruleAtemModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_dsl_Template_Status_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_dsl_Template_Driver_4_0 = null;

        EObject lv_dsl_Template_head_5_0 = null;

        EObject lv_dsl_Template_preface_6_0 = null;

        EObject lv_dsl_Template_components_7_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:80:28: ( (otherlv_0= 'Template' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )? ( (lv_dsl_Template_head_5_0= ruleHead ) )? ( (lv_dsl_Template_preface_6_0= rulePreface ) )? ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )* otherlv_8= 'End-Template' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:81:1: (otherlv_0= 'Template' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )? ( (lv_dsl_Template_head_5_0= ruleHead ) )? ( (lv_dsl_Template_preface_6_0= rulePreface ) )? ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )* otherlv_8= 'End-Template' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:81:1: (otherlv_0= 'Template' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )? ( (lv_dsl_Template_head_5_0= ruleHead ) )? ( (lv_dsl_Template_preface_6_0= rulePreface ) )? ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )* otherlv_8= 'End-Template' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:81:3: otherlv_0= 'Template' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )? ( (lv_dsl_Template_head_5_0= ruleHead ) )? ( (lv_dsl_Template_preface_6_0= rulePreface ) )? ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )* otherlv_8= 'End-Template'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAtemModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getAtemModelAccess().getTemplateKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:87:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAtemModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtemModel143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:103:2: ( (lv_dsl_Template_Status_2_0= ruleTemplateStatus ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==43) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:104:1: (lv_dsl_Template_Status_2_0= ruleTemplateStatus )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:104:1: (lv_dsl_Template_Status_2_0= ruleTemplateStatus )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:105:3: lv_dsl_Template_Status_2_0= ruleTemplateStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtemModelAccess().getDsl_Template_StatusTemplateStatusParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateStatus_in_ruleAtemModel164);
                    lv_dsl_Template_Status_2_0=ruleTemplateStatus();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Template_Status",
                            		lv_dsl_Template_Status_2_0, 
                            		"TemplateStatus");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:121:3: ( (lv_imports_3_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==46) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:122:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:122:1: (lv_imports_3_0= ruleImport )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:123:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtemModelAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleAtemModel186);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:139:3: ( (lv_dsl_Template_Driver_4_0= ruleDriver ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:140:1: (lv_dsl_Template_Driver_4_0= ruleDriver )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:140:1: (lv_dsl_Template_Driver_4_0= ruleDriver )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:141:3: lv_dsl_Template_Driver_4_0= ruleDriver
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtemModelAccess().getDsl_Template_DriverDriverParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDriver_in_ruleAtemModel208);
                    lv_dsl_Template_Driver_4_0=ruleDriver();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Template_Driver",
                            		lv_dsl_Template_Driver_4_0, 
                            		"Driver");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:157:3: ( (lv_dsl_Template_head_5_0= ruleHead ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:158:1: (lv_dsl_Template_head_5_0= ruleHead )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:158:1: (lv_dsl_Template_head_5_0= ruleHead )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:159:3: lv_dsl_Template_head_5_0= ruleHead
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtemModelAccess().getDsl_Template_headHeadParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHead_in_ruleAtemModel230);
                    lv_dsl_Template_head_5_0=ruleHead();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Template_head",
                            		lv_dsl_Template_head_5_0, 
                            		"Head");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:175:3: ( (lv_dsl_Template_preface_6_0= rulePreface ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==65) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:176:1: (lv_dsl_Template_preface_6_0= rulePreface )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:176:1: (lv_dsl_Template_preface_6_0= rulePreface )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:177:3: lv_dsl_Template_preface_6_0= rulePreface
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtemModelAccess().getDsl_Template_prefacePrefaceParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_rulePreface_in_ruleAtemModel252);
                    lv_dsl_Template_preface_6_0=rulePreface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Template_preface",
                            		lv_dsl_Template_preface_6_0, 
                            		"Preface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:193:3: ( (lv_dsl_Template_components_7_0= ruleAbstractComponent ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==47||LA6_0==58||LA6_0==67||LA6_0==87||(LA6_0>=89 && LA6_0<=90)||LA6_0==94||LA6_0==97||LA6_0==99||LA6_0==101||LA6_0==103||LA6_0==105||LA6_0==107||LA6_0==109||LA6_0==111||LA6_0==113||LA6_0==115||LA6_0==117||LA6_0==119||LA6_0==121||LA6_0==123||(LA6_0>=125 && LA6_0<=128)||(LA6_0>=132 && LA6_0<=133)||(LA6_0>=138 && LA6_0<=144)||(LA6_0>=146 && LA6_0<=148)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:194:1: (lv_dsl_Template_components_7_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:194:1: (lv_dsl_Template_components_7_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:195:3: lv_dsl_Template_components_7_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtemModelAccess().getDsl_Template_componentsAbstractComponentParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleAtemModel274);
            	    lv_dsl_Template_components_7_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAtemModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Template_components",
            	            		lv_dsl_Template_components_7_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleAtemModel287); 

                	newLeafNode(otherlv_8, grammarAccess.getAtemModelAccess().getEndTemplateKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtemModel"


    // $ANTLR start "entryRuleHead"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:223:1: entryRuleHead returns [EObject current=null] : iv_ruleHead= ruleHead EOF ;
    public final EObject entryRuleHead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHead = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:224:2: (iv_ruleHead= ruleHead EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:225:2: iv_ruleHead= ruleHead EOF
            {
             newCompositeNode(grammarAccess.getHeadRule()); 
            pushFollow(FOLLOW_ruleHead_in_entryRuleHead323);
            iv_ruleHead=ruleHead();

            state._fsp--;

             current =iv_ruleHead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHead333); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHead"


    // $ANTLR start "ruleHead"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:232:1: ruleHead returns [EObject current=null] : (otherlv_0= 'Head' ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+ otherlv_2= 'End_Head' ) ;
    public final EObject ruleHead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Head_components_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:235:28: ( (otherlv_0= 'Head' ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+ otherlv_2= 'End_Head' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:236:1: (otherlv_0= 'Head' ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+ otherlv_2= 'End_Head' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:236:1: (otherlv_0= 'Head' ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+ otherlv_2= 'End_Head' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:236:3: otherlv_0= 'Head' ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+ otherlv_2= 'End_Head'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleHead370); 

                	newLeafNode(otherlv_0, grammarAccess.getHeadAccess().getHeadKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:240:1: ( (lv_dsl_Head_components_1_0= ruleHeadComponent ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19||LA7_0==21||LA7_0==23||LA7_0==25||LA7_0==27||LA7_0==29||LA7_0==41||LA7_0==60||LA7_0==92) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:241:1: (lv_dsl_Head_components_1_0= ruleHeadComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:241:1: (lv_dsl_Head_components_1_0= ruleHeadComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:242:3: lv_dsl_Head_components_1_0= ruleHeadComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeadAccess().getDsl_Head_componentsHeadComponentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeadComponent_in_ruleHead391);
            	    lv_dsl_Head_components_1_0=ruleHeadComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeadRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Head_components",
            	            		lv_dsl_Head_components_1_0, 
            	            		"HeadComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleHead404); 

                	newLeafNode(otherlv_2, grammarAccess.getHeadAccess().getEnd_HeadKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHead"


    // $ANTLR start "entryRuleHeadComponent"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:270:1: entryRuleHeadComponent returns [EObject current=null] : iv_ruleHeadComponent= ruleHeadComponent EOF ;
    public final EObject entryRuleHeadComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadComponent = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:271:2: (iv_ruleHeadComponent= ruleHeadComponent EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:272:2: iv_ruleHeadComponent= ruleHeadComponent EOF
            {
             newCompositeNode(grammarAccess.getHeadComponentRule()); 
            pushFollow(FOLLOW_ruleHeadComponent_in_entryRuleHeadComponent440);
            iv_ruleHeadComponent=ruleHeadComponent();

            state._fsp--;

             current =iv_ruleHeadComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeadComponent450); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeadComponent"


    // $ANTLR start "ruleHeadComponent"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:279:1: ruleHeadComponent returns [EObject current=null] : (this_Commemoration_0= ruleCommemoration | this_Date_1= ruleDate | this_PageHeaderEven_2= rulePageHeaderEven | this_PageHeaderOdd_3= rulePageHeaderOdd | this_PageFooterEven_4= rulePageFooterEven | this_PageFooterOdd_5= rulePageFooterOdd | this_PageKeepWithNext_6= rulePageKeepWithNext | this_PageNumber_7= rulePageNumber | this_TemplateTitle_8= ruleTemplateTitle ) ;
    public final EObject ruleHeadComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Commemoration_0 = null;

        EObject this_Date_1 = null;

        EObject this_PageHeaderEven_2 = null;

        EObject this_PageHeaderOdd_3 = null;

        EObject this_PageFooterEven_4 = null;

        EObject this_PageFooterOdd_5 = null;

        EObject this_PageKeepWithNext_6 = null;

        EObject this_PageNumber_7 = null;

        EObject this_TemplateTitle_8 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:282:28: ( (this_Commemoration_0= ruleCommemoration | this_Date_1= ruleDate | this_PageHeaderEven_2= rulePageHeaderEven | this_PageHeaderOdd_3= rulePageHeaderOdd | this_PageFooterEven_4= rulePageFooterEven | this_PageFooterOdd_5= rulePageFooterOdd | this_PageKeepWithNext_6= rulePageKeepWithNext | this_PageNumber_7= rulePageNumber | this_TemplateTitle_8= ruleTemplateTitle ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:283:1: (this_Commemoration_0= ruleCommemoration | this_Date_1= ruleDate | this_PageHeaderEven_2= rulePageHeaderEven | this_PageHeaderOdd_3= rulePageHeaderOdd | this_PageFooterEven_4= rulePageFooterEven | this_PageFooterOdd_5= rulePageFooterOdd | this_PageKeepWithNext_6= rulePageKeepWithNext | this_PageNumber_7= rulePageNumber | this_TemplateTitle_8= ruleTemplateTitle )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:283:1: (this_Commemoration_0= ruleCommemoration | this_Date_1= ruleDate | this_PageHeaderEven_2= rulePageHeaderEven | this_PageHeaderOdd_3= rulePageHeaderOdd | this_PageFooterEven_4= rulePageFooterEven | this_PageFooterOdd_5= rulePageFooterOdd | this_PageKeepWithNext_6= rulePageKeepWithNext | this_PageNumber_7= rulePageNumber | this_TemplateTitle_8= ruleTemplateTitle )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt8=1;
                }
                break;
            case 60:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            case 29:
                {
                alt8=6;
                }
                break;
            case 21:
                {
                alt8=7;
                }
                break;
            case 92:
                {
                alt8=8;
                }
                break;
            case 19:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:284:5: this_Commemoration_0= ruleCommemoration
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getCommemorationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCommemoration_in_ruleHeadComponent497);
                    this_Commemoration_0=ruleCommemoration();

                    state._fsp--;

                     
                            current = this_Commemoration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:294:5: this_Date_1= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getDateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDate_in_ruleHeadComponent524);
                    this_Date_1=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:304:5: this_PageHeaderEven_2= rulePageHeaderEven
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageHeaderEvenParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePageHeaderEven_in_ruleHeadComponent551);
                    this_PageHeaderEven_2=rulePageHeaderEven();

                    state._fsp--;

                     
                            current = this_PageHeaderEven_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:314:5: this_PageHeaderOdd_3= rulePageHeaderOdd
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageHeaderOddParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePageHeaderOdd_in_ruleHeadComponent578);
                    this_PageHeaderOdd_3=rulePageHeaderOdd();

                    state._fsp--;

                     
                            current = this_PageHeaderOdd_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:324:5: this_PageFooterEven_4= rulePageFooterEven
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageFooterEvenParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePageFooterEven_in_ruleHeadComponent605);
                    this_PageFooterEven_4=rulePageFooterEven();

                    state._fsp--;

                     
                            current = this_PageFooterEven_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:334:5: this_PageFooterOdd_5= rulePageFooterOdd
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageFooterOddParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulePageFooterOdd_in_ruleHeadComponent632);
                    this_PageFooterOdd_5=rulePageFooterOdd();

                    state._fsp--;

                     
                            current = this_PageFooterOdd_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:344:5: this_PageKeepWithNext_6= rulePageKeepWithNext
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageKeepWithNextParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulePageKeepWithNext_in_ruleHeadComponent659);
                    this_PageKeepWithNext_6=rulePageKeepWithNext();

                    state._fsp--;

                     
                            current = this_PageKeepWithNext_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:354:5: this_PageNumber_7= rulePageNumber
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getPageNumberParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_rulePageNumber_in_ruleHeadComponent686);
                    this_PageNumber_7=rulePageNumber();

                    state._fsp--;

                     
                            current = this_PageNumber_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:364:5: this_TemplateTitle_8= ruleTemplateTitle
                    {
                     
                            newCompositeNode(grammarAccess.getHeadComponentAccess().getTemplateTitleParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleTemplateTitle_in_ruleHeadComponent713);
                    this_TemplateTitle_8=ruleTemplateTitle();

                    state._fsp--;

                     
                            current = this_TemplateTitle_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeadComponent"


    // $ANTLR start "entryRuleDriver"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:380:1: entryRuleDriver returns [EObject current=null] : iv_ruleDriver= ruleDriver EOF ;
    public final EObject entryRuleDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDriver = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:381:2: (iv_ruleDriver= ruleDriver EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:382:2: iv_ruleDriver= ruleDriver EOF
            {
             newCompositeNode(grammarAccess.getDriverRule()); 
            pushFollow(FOLLOW_ruleDriver_in_entryRuleDriver748);
            iv_ruleDriver=ruleDriver();

            state._fsp--;

             current =iv_ruleDriver; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDriver758); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDriver"


    // $ANTLR start "ruleDriver"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:389:1: ruleDriver returns [EObject current=null] : (otherlv_0= 'Generation_Driver' otherlv_1= 'Service_Regular_Expression' ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) ) (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )? otherlv_5= 'End_Generation_Driver' ) ;
    public final EObject ruleDriver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_dsl_Driver_RegEx_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_dsl_Driver_Status_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:392:28: ( (otherlv_0= 'Generation_Driver' otherlv_1= 'Service_Regular_Expression' ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) ) (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )? otherlv_5= 'End_Generation_Driver' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:393:1: (otherlv_0= 'Generation_Driver' otherlv_1= 'Service_Regular_Expression' ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) ) (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )? otherlv_5= 'End_Generation_Driver' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:393:1: (otherlv_0= 'Generation_Driver' otherlv_1= 'Service_Regular_Expression' ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) ) (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )? otherlv_5= 'End_Generation_Driver' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:393:3: otherlv_0= 'Generation_Driver' otherlv_1= 'Service_Regular_Expression' ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) ) (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )? otherlv_5= 'End_Generation_Driver'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDriver795); 

                	newLeafNode(otherlv_0, grammarAccess.getDriverAccess().getGeneration_DriverKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleDriver807); 

                	newLeafNode(otherlv_1, grammarAccess.getDriverAccess().getService_Regular_ExpressionKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:401:1: ( (lv_dsl_Driver_RegEx_2_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:402:1: (lv_dsl_Driver_RegEx_2_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:402:1: (lv_dsl_Driver_RegEx_2_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:403:3: lv_dsl_Driver_RegEx_2_0= RULE_STRING
            {
            lv_dsl_Driver_RegEx_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDriver824); 

            			newLeafNode(lv_dsl_Driver_RegEx_2_0, grammarAccess.getDriverAccess().getDsl_Driver_RegExSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDriverRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Driver_RegEx",
                    		lv_dsl_Driver_RegEx_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:419:2: (otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:419:4: otherlv_3= 'Service_Status' ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleDriver842); 

                        	newLeafNode(otherlv_3, grammarAccess.getDriverAccess().getService_StatusKeyword_3_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:423:1: ( (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:424:1: (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:424:1: (lv_dsl_Driver_Status_4_0= ruleTemplateStatuses )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:425:3: lv_dsl_Driver_Status_4_0= ruleTemplateStatuses
                    {
                     
                    	        newCompositeNode(grammarAccess.getDriverAccess().getDsl_Driver_StatusTemplateStatusesEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTemplateStatuses_in_ruleDriver863);
                    lv_dsl_Driver_Status_4_0=ruleTemplateStatuses();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDriverRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Driver_Status",
                            		lv_dsl_Driver_Status_4_0, 
                            		"TemplateStatuses");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDriver877); 

                	newLeafNode(otherlv_5, grammarAccess.getDriverAccess().getEnd_Generation_DriverKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDriver"


    // $ANTLR start "entryRuleTemplateTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:453:1: entryRuleTemplateTitle returns [EObject current=null] : iv_ruleTemplateTitle= ruleTemplateTitle EOF ;
    public final EObject entryRuleTemplateTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateTitle = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:454:2: (iv_ruleTemplateTitle= ruleTemplateTitle EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:455:2: iv_ruleTemplateTitle= ruleTemplateTitle EOF
            {
             newCompositeNode(grammarAccess.getTemplateTitleRule()); 
            pushFollow(FOLLOW_ruleTemplateTitle_in_entryRuleTemplateTitle913);
            iv_ruleTemplateTitle=ruleTemplateTitle();

            state._fsp--;

             current =iv_ruleTemplateTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateTitle923); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateTitle"


    // $ANTLR start "ruleTemplateTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:462:1: ruleTemplateTitle returns [EObject current=null] : (otherlv_0= 'Template_Title' ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Title' ) ;
    public final EObject ruleTemplateTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_TemplateTitle_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:465:28: ( (otherlv_0= 'Template_Title' ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Title' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:466:1: (otherlv_0= 'Template_Title' ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Title' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:466:1: (otherlv_0= 'Template_Title' ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Title' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:466:3: otherlv_0= 'Template_Title' ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Title'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTemplateTitle960); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateTitleAccess().getTemplate_TitleKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:470:1: ( (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=34 && LA10_0<=35)||(LA10_0>=37 && LA10_0<=40)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:471:1: (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:471:1: (lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:472:3: lv_dsl_TemplateTitle_Elements_1_0= ruleHeaderFooterFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemplateTitleAccess().getDsl_TemplateTitle_ElementsHeaderFooterFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterFragment_in_ruleTemplateTitle981);
            	    lv_dsl_TemplateTitle_Elements_1_0=ruleHeaderFooterFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemplateTitleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_TemplateTitle_Elements",
            	            		lv_dsl_TemplateTitle_Elements_1_0, 
            	            		"HeaderFooterFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTemplateTitle994); 

                	newLeafNode(otherlv_2, grammarAccess.getTemplateTitleAccess().getEnd_TitleKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateTitle"


    // $ANTLR start "entryRulePageKeepWithNext"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:500:1: entryRulePageKeepWithNext returns [EObject current=null] : iv_rulePageKeepWithNext= rulePageKeepWithNext EOF ;
    public final EObject entryRulePageKeepWithNext() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageKeepWithNext = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:501:2: (iv_rulePageKeepWithNext= rulePageKeepWithNext EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:502:2: iv_rulePageKeepWithNext= rulePageKeepWithNext EOF
            {
             newCompositeNode(grammarAccess.getPageKeepWithNextRule()); 
            pushFollow(FOLLOW_rulePageKeepWithNext_in_entryRulePageKeepWithNext1030);
            iv_rulePageKeepWithNext=rulePageKeepWithNext();

            state._fsp--;

             current =iv_rulePageKeepWithNext; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageKeepWithNext1040); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageKeepWithNext"


    // $ANTLR start "rulePageKeepWithNext"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:509:1: rulePageKeepWithNext returns [EObject current=null] : (otherlv_0= 'Page_Keep_With_Next' ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) ) otherlv_2= 'End_Page_Keep_With_Next' ) ;
    public final EObject rulePageKeepWithNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_PageKeepWithNext_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:512:28: ( (otherlv_0= 'Page_Keep_With_Next' ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) ) otherlv_2= 'End_Page_Keep_With_Next' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:513:1: (otherlv_0= 'Page_Keep_With_Next' ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) ) otherlv_2= 'End_Page_Keep_With_Next' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:513:1: (otherlv_0= 'Page_Keep_With_Next' ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) ) otherlv_2= 'End_Page_Keep_With_Next' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:513:3: otherlv_0= 'Page_Keep_With_Next' ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) ) otherlv_2= 'End_Page_Keep_With_Next'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulePageKeepWithNext1077); 

                	newLeafNode(otherlv_0, grammarAccess.getPageKeepWithNextAccess().getPage_Keep_With_NextKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:517:1: ( (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:518:1: (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:518:1: (lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:519:3: lv_dsl_PageKeepWithNext_value_1_0= RULE_STRING
            {
            lv_dsl_PageKeepWithNext_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePageKeepWithNext1094); 

            			newLeafNode(lv_dsl_PageKeepWithNext_value_1_0, grammarAccess.getPageKeepWithNextAccess().getDsl_PageKeepWithNext_valueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageKeepWithNextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_PageKeepWithNext_value",
                    		lv_dsl_PageKeepWithNext_value_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulePageKeepWithNext1111); 

                	newLeafNode(otherlv_2, grammarAccess.getPageKeepWithNextAccess().getEnd_Page_Keep_With_NextKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageKeepWithNext"


    // $ANTLR start "entryRulePageHeaderEven"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:547:1: entryRulePageHeaderEven returns [EObject current=null] : iv_rulePageHeaderEven= rulePageHeaderEven EOF ;
    public final EObject entryRulePageHeaderEven() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageHeaderEven = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:548:2: (iv_rulePageHeaderEven= rulePageHeaderEven EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:549:2: iv_rulePageHeaderEven= rulePageHeaderEven EOF
            {
             newCompositeNode(grammarAccess.getPageHeaderEvenRule()); 
            pushFollow(FOLLOW_rulePageHeaderEven_in_entryRulePageHeaderEven1147);
            iv_rulePageHeaderEven=rulePageHeaderEven();

            state._fsp--;

             current =iv_rulePageHeaderEven; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageHeaderEven1157); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageHeaderEven"


    // $ANTLR start "rulePageHeaderEven"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:556:1: rulePageHeaderEven returns [EObject current=null] : (otherlv_0= 'Page_Header_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Even' ) ;
    public final EObject rulePageHeaderEven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_PageHeader_columns_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:559:28: ( (otherlv_0= 'Page_Header_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Even' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:560:1: (otherlv_0= 'Page_Header_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Even' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:560:1: (otherlv_0= 'Page_Header_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Even' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:560:3: otherlv_0= 'Page_Header_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Even'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_rulePageHeaderEven1194); 

                	newLeafNode(otherlv_0, grammarAccess.getPageHeaderEvenAccess().getPage_Header_EvenKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:564:1: ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=31 && LA11_0<=33)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:565:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:565:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:566:3: lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageHeaderEvenAccess().getDsl_PageHeader_columnsHeaderFooterColumnParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterColumn_in_rulePageHeaderEven1215);
            	    lv_dsl_PageHeader_columns_1_0=ruleHeaderFooterColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageHeaderEvenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_PageHeader_columns",
            	            		lv_dsl_PageHeader_columns_1_0, 
            	            		"HeaderFooterColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_rulePageHeaderEven1228); 

                	newLeafNode(otherlv_2, grammarAccess.getPageHeaderEvenAccess().getEnd_Page_Header_EvenKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageHeaderEven"


    // $ANTLR start "entryRulePageHeaderOdd"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:594:1: entryRulePageHeaderOdd returns [EObject current=null] : iv_rulePageHeaderOdd= rulePageHeaderOdd EOF ;
    public final EObject entryRulePageHeaderOdd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageHeaderOdd = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:595:2: (iv_rulePageHeaderOdd= rulePageHeaderOdd EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:596:2: iv_rulePageHeaderOdd= rulePageHeaderOdd EOF
            {
             newCompositeNode(grammarAccess.getPageHeaderOddRule()); 
            pushFollow(FOLLOW_rulePageHeaderOdd_in_entryRulePageHeaderOdd1264);
            iv_rulePageHeaderOdd=rulePageHeaderOdd();

            state._fsp--;

             current =iv_rulePageHeaderOdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageHeaderOdd1274); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageHeaderOdd"


    // $ANTLR start "rulePageHeaderOdd"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:603:1: rulePageHeaderOdd returns [EObject current=null] : (otherlv_0= 'Page_Header_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Odd' ) ;
    public final EObject rulePageHeaderOdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_PageHeader_columns_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:606:28: ( (otherlv_0= 'Page_Header_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Odd' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:607:1: (otherlv_0= 'Page_Header_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Odd' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:607:1: (otherlv_0= 'Page_Header_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Odd' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:607:3: otherlv_0= 'Page_Header_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Header_Odd'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_rulePageHeaderOdd1311); 

                	newLeafNode(otherlv_0, grammarAccess.getPageHeaderOddAccess().getPage_Header_OddKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:611:1: ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=31 && LA12_0<=33)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:612:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:612:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:613:3: lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageHeaderOddAccess().getDsl_PageHeader_columnsHeaderFooterColumnParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterColumn_in_rulePageHeaderOdd1332);
            	    lv_dsl_PageHeader_columns_1_0=ruleHeaderFooterColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageHeaderOddRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_PageHeader_columns",
            	            		lv_dsl_PageHeader_columns_1_0, 
            	            		"HeaderFooterColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_rulePageHeaderOdd1345); 

                	newLeafNode(otherlv_2, grammarAccess.getPageHeaderOddAccess().getEnd_Page_Header_OddKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageHeaderOdd"


    // $ANTLR start "entryRulePageFooterEven"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:641:1: entryRulePageFooterEven returns [EObject current=null] : iv_rulePageFooterEven= rulePageFooterEven EOF ;
    public final EObject entryRulePageFooterEven() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFooterEven = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:642:2: (iv_rulePageFooterEven= rulePageFooterEven EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:643:2: iv_rulePageFooterEven= rulePageFooterEven EOF
            {
             newCompositeNode(grammarAccess.getPageFooterEvenRule()); 
            pushFollow(FOLLOW_rulePageFooterEven_in_entryRulePageFooterEven1381);
            iv_rulePageFooterEven=rulePageFooterEven();

            state._fsp--;

             current =iv_rulePageFooterEven; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageFooterEven1391); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageFooterEven"


    // $ANTLR start "rulePageFooterEven"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:650:1: rulePageFooterEven returns [EObject current=null] : (otherlv_0= 'Page_Footer_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Even' ) ;
    public final EObject rulePageFooterEven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_PageHeader_columns_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:653:28: ( (otherlv_0= 'Page_Footer_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Even' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:654:1: (otherlv_0= 'Page_Footer_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Even' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:654:1: (otherlv_0= 'Page_Footer_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Even' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:654:3: otherlv_0= 'Page_Footer_Even' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Even'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulePageFooterEven1428); 

                	newLeafNode(otherlv_0, grammarAccess.getPageFooterEvenAccess().getPage_Footer_EvenKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:658:1: ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=31 && LA13_0<=33)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:659:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:659:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:660:3: lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageFooterEvenAccess().getDsl_PageHeader_columnsHeaderFooterColumnParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterColumn_in_rulePageFooterEven1449);
            	    lv_dsl_PageHeader_columns_1_0=ruleHeaderFooterColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageFooterEvenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_PageHeader_columns",
            	            		lv_dsl_PageHeader_columns_1_0, 
            	            		"HeaderFooterColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_rulePageFooterEven1462); 

                	newLeafNode(otherlv_2, grammarAccess.getPageFooterEvenAccess().getEnd_Page_Footer_EvenKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageFooterEven"


    // $ANTLR start "entryRulePageFooterOdd"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:688:1: entryRulePageFooterOdd returns [EObject current=null] : iv_rulePageFooterOdd= rulePageFooterOdd EOF ;
    public final EObject entryRulePageFooterOdd() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageFooterOdd = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:689:2: (iv_rulePageFooterOdd= rulePageFooterOdd EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:690:2: iv_rulePageFooterOdd= rulePageFooterOdd EOF
            {
             newCompositeNode(grammarAccess.getPageFooterOddRule()); 
            pushFollow(FOLLOW_rulePageFooterOdd_in_entryRulePageFooterOdd1498);
            iv_rulePageFooterOdd=rulePageFooterOdd();

            state._fsp--;

             current =iv_rulePageFooterOdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageFooterOdd1508); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageFooterOdd"


    // $ANTLR start "rulePageFooterOdd"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:697:1: rulePageFooterOdd returns [EObject current=null] : (otherlv_0= 'Page_Footer_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Odd' ) ;
    public final EObject rulePageFooterOdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_PageHeader_columns_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:700:28: ( (otherlv_0= 'Page_Footer_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Odd' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:701:1: (otherlv_0= 'Page_Footer_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Odd' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:701:1: (otherlv_0= 'Page_Footer_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Odd' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:701:3: otherlv_0= 'Page_Footer_Odd' ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+ otherlv_2= 'End_Page_Footer_Odd'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_rulePageFooterOdd1545); 

                	newLeafNode(otherlv_0, grammarAccess.getPageFooterOddAccess().getPage_Footer_OddKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:705:1: ( (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=31 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:706:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:706:1: (lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:707:3: lv_dsl_PageHeader_columns_1_0= ruleHeaderFooterColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageFooterOddAccess().getDsl_PageHeader_columnsHeaderFooterColumnParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterColumn_in_rulePageFooterOdd1566);
            	    lv_dsl_PageHeader_columns_1_0=ruleHeaderFooterColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageFooterOddRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_PageHeader_columns",
            	            		lv_dsl_PageHeader_columns_1_0, 
            	            		"HeaderFooterColumn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePageFooterOdd1579); 

                	newLeafNode(otherlv_2, grammarAccess.getPageFooterOddAccess().getEnd_Page_Footer_OddKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageFooterOdd"


    // $ANTLR start "entryRuleHeaderFooterColumn"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:735:1: entryRuleHeaderFooterColumn returns [EObject current=null] : iv_ruleHeaderFooterColumn= ruleHeaderFooterColumn EOF ;
    public final EObject entryRuleHeaderFooterColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterColumn = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:736:2: (iv_ruleHeaderFooterColumn= ruleHeaderFooterColumn EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:737:2: iv_ruleHeaderFooterColumn= ruleHeaderFooterColumn EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterColumnRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterColumn_in_entryRuleHeaderFooterColumn1615);
            iv_ruleHeaderFooterColumn=ruleHeaderFooterColumn();

            state._fsp--;

             current =iv_ruleHeaderFooterColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterColumn1625); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterColumn"


    // $ANTLR start "ruleHeaderFooterColumn"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:744:1: ruleHeaderFooterColumn returns [EObject current=null] : (this_HeaderFooterColumnLeft_0= ruleHeaderFooterColumnLeft | this_HeaderFooterColumnCenter_1= ruleHeaderFooterColumnCenter | this_HeaderFooterColumnRight_2= ruleHeaderFooterColumnRight ) ;
    public final EObject ruleHeaderFooterColumn() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderFooterColumnLeft_0 = null;

        EObject this_HeaderFooterColumnCenter_1 = null;

        EObject this_HeaderFooterColumnRight_2 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:747:28: ( (this_HeaderFooterColumnLeft_0= ruleHeaderFooterColumnLeft | this_HeaderFooterColumnCenter_1= ruleHeaderFooterColumnCenter | this_HeaderFooterColumnRight_2= ruleHeaderFooterColumnRight ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:748:1: (this_HeaderFooterColumnLeft_0= ruleHeaderFooterColumnLeft | this_HeaderFooterColumnCenter_1= ruleHeaderFooterColumnCenter | this_HeaderFooterColumnRight_2= ruleHeaderFooterColumnRight )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:748:1: (this_HeaderFooterColumnLeft_0= ruleHeaderFooterColumnLeft | this_HeaderFooterColumnCenter_1= ruleHeaderFooterColumnCenter | this_HeaderFooterColumnRight_2= ruleHeaderFooterColumnRight )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:749:5: this_HeaderFooterColumnLeft_0= ruleHeaderFooterColumnLeft
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterColumnAccess().getHeaderFooterColumnLeftParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterColumnLeft_in_ruleHeaderFooterColumn1672);
                    this_HeaderFooterColumnLeft_0=ruleHeaderFooterColumnLeft();

                    state._fsp--;

                     
                            current = this_HeaderFooterColumnLeft_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:759:5: this_HeaderFooterColumnCenter_1= ruleHeaderFooterColumnCenter
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterColumnAccess().getHeaderFooterColumnCenterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterColumnCenter_in_ruleHeaderFooterColumn1699);
                    this_HeaderFooterColumnCenter_1=ruleHeaderFooterColumnCenter();

                    state._fsp--;

                     
                            current = this_HeaderFooterColumnCenter_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:769:5: this_HeaderFooterColumnRight_2= ruleHeaderFooterColumnRight
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterColumnAccess().getHeaderFooterColumnRightParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterColumnRight_in_ruleHeaderFooterColumn1726);
                    this_HeaderFooterColumnRight_2=ruleHeaderFooterColumnRight();

                    state._fsp--;

                     
                            current = this_HeaderFooterColumnRight_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterColumn"


    // $ANTLR start "entryRuleHeaderFooterColumnLeft"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:785:1: entryRuleHeaderFooterColumnLeft returns [EObject current=null] : iv_ruleHeaderFooterColumnLeft= ruleHeaderFooterColumnLeft EOF ;
    public final EObject entryRuleHeaderFooterColumnLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterColumnLeft = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:786:2: (iv_ruleHeaderFooterColumnLeft= ruleHeaderFooterColumnLeft EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:787:2: iv_ruleHeaderFooterColumnLeft= ruleHeaderFooterColumnLeft EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterColumnLeftRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterColumnLeft_in_entryRuleHeaderFooterColumnLeft1761);
            iv_ruleHeaderFooterColumnLeft=ruleHeaderFooterColumnLeft();

            state._fsp--;

             current =iv_ruleHeaderFooterColumnLeft; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterColumnLeft1771); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterColumnLeft"


    // $ANTLR start "ruleHeaderFooterColumnLeft"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:794:1: ruleHeaderFooterColumnLeft returns [EObject current=null] : (otherlv_0= 'left' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) ;
    public final EObject ruleHeaderFooterColumnLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dsl_HeaderFooterColumn_fragments_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:797:28: ( (otherlv_0= 'left' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:798:1: (otherlv_0= 'left' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:798:1: (otherlv_0= 'left' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:798:3: otherlv_0= 'left' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleHeaderFooterColumnLeft1808); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderFooterColumnLeftAccess().getLeftKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:802:1: ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=34 && LA16_0<=35)||(LA16_0>=37 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:803:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:803:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:804:3: lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderFooterColumnLeftAccess().getDsl_HeaderFooterColumn_fragmentsHeaderFooterFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnLeft1829);
            	    lv_dsl_HeaderFooterColumn_fragments_1_0=ruleHeaderFooterFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderFooterColumnLeftRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_HeaderFooterColumn_fragments",
            	            		lv_dsl_HeaderFooterColumn_fragments_1_0, 
            	            		"HeaderFooterFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterColumnLeft"


    // $ANTLR start "entryRuleHeaderFooterColumnCenter"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:828:1: entryRuleHeaderFooterColumnCenter returns [EObject current=null] : iv_ruleHeaderFooterColumnCenter= ruleHeaderFooterColumnCenter EOF ;
    public final EObject entryRuleHeaderFooterColumnCenter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterColumnCenter = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:829:2: (iv_ruleHeaderFooterColumnCenter= ruleHeaderFooterColumnCenter EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:830:2: iv_ruleHeaderFooterColumnCenter= ruleHeaderFooterColumnCenter EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterColumnCenterRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterColumnCenter_in_entryRuleHeaderFooterColumnCenter1866);
            iv_ruleHeaderFooterColumnCenter=ruleHeaderFooterColumnCenter();

            state._fsp--;

             current =iv_ruleHeaderFooterColumnCenter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterColumnCenter1876); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterColumnCenter"


    // $ANTLR start "ruleHeaderFooterColumnCenter"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:837:1: ruleHeaderFooterColumnCenter returns [EObject current=null] : (otherlv_0= 'center' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) ;
    public final EObject ruleHeaderFooterColumnCenter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dsl_HeaderFooterColumn_fragments_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:840:28: ( (otherlv_0= 'center' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:841:1: (otherlv_0= 'center' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:841:1: (otherlv_0= 'center' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:841:3: otherlv_0= 'center' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleHeaderFooterColumnCenter1913); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderFooterColumnCenterAccess().getCenterKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:845:1: ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=34 && LA17_0<=35)||(LA17_0>=37 && LA17_0<=40)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:846:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:846:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:847:3: lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderFooterColumnCenterAccess().getDsl_HeaderFooterColumn_fragmentsHeaderFooterFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnCenter1934);
            	    lv_dsl_HeaderFooterColumn_fragments_1_0=ruleHeaderFooterFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderFooterColumnCenterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_HeaderFooterColumn_fragments",
            	            		lv_dsl_HeaderFooterColumn_fragments_1_0, 
            	            		"HeaderFooterFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterColumnCenter"


    // $ANTLR start "entryRuleHeaderFooterColumnRight"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:871:1: entryRuleHeaderFooterColumnRight returns [EObject current=null] : iv_ruleHeaderFooterColumnRight= ruleHeaderFooterColumnRight EOF ;
    public final EObject entryRuleHeaderFooterColumnRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterColumnRight = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:872:2: (iv_ruleHeaderFooterColumnRight= ruleHeaderFooterColumnRight EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:873:2: iv_ruleHeaderFooterColumnRight= ruleHeaderFooterColumnRight EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterColumnRightRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterColumnRight_in_entryRuleHeaderFooterColumnRight1971);
            iv_ruleHeaderFooterColumnRight=ruleHeaderFooterColumnRight();

            state._fsp--;

             current =iv_ruleHeaderFooterColumnRight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterColumnRight1981); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterColumnRight"


    // $ANTLR start "ruleHeaderFooterColumnRight"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:880:1: ruleHeaderFooterColumnRight returns [EObject current=null] : (otherlv_0= 'right' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) ;
    public final EObject ruleHeaderFooterColumnRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dsl_HeaderFooterColumn_fragments_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:883:28: ( (otherlv_0= 'right' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:884:1: (otherlv_0= 'right' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:884:1: (otherlv_0= 'right' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+ )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:884:3: otherlv_0= 'right' ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleHeaderFooterColumnRight2018); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderFooterColumnRightAccess().getRightKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:888:1: ( (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=34 && LA18_0<=35)||(LA18_0>=37 && LA18_0<=40)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:889:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:889:1: (lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:890:3: lv_dsl_HeaderFooterColumn_fragments_1_0= ruleHeaderFooterFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderFooterColumnRightAccess().getDsl_HeaderFooterColumn_fragmentsHeaderFooterFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnRight2039);
            	    lv_dsl_HeaderFooterColumn_fragments_1_0=ruleHeaderFooterFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderFooterColumnRightRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_HeaderFooterColumn_fragments",
            	            		lv_dsl_HeaderFooterColumn_fragments_1_0, 
            	            		"HeaderFooterFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterColumnRight"


    // $ANTLR start "entryRuleHeaderFooterFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:914:1: entryRuleHeaderFooterFragment returns [EObject current=null] : iv_ruleHeaderFooterFragment= ruleHeaderFooterFragment EOF ;
    public final EObject entryRuleHeaderFooterFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterFragment = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:915:2: (iv_ruleHeaderFooterFragment= ruleHeaderFooterFragment EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:916:2: iv_ruleHeaderFooterFragment= ruleHeaderFooterFragment EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterFragmentRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterFragment_in_entryRuleHeaderFooterFragment2076);
            iv_ruleHeaderFooterFragment=ruleHeaderFooterFragment();

            state._fsp--;

             current =iv_ruleHeaderFooterFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterFragment2086); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterFragment"


    // $ANTLR start "ruleHeaderFooterFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:923:1: ruleHeaderFooterFragment returns [EObject current=null] : (this_HeaderFooterText_0= ruleHeaderFooterText | this_HeaderFooterDate_1= ruleHeaderFooterDate | this_HeaderFooterPageNumber_2= ruleHeaderFooterPageNumber | this_HeaderFooterLookup_3= ruleHeaderFooterLookup | this_HeaderFooterTitle_4= ruleHeaderFooterTitle | this_HeaderFooterCommemoration_5= ruleHeaderFooterCommemoration ) ;
    public final EObject ruleHeaderFooterFragment() throws RecognitionException {
        EObject current = null;

        EObject this_HeaderFooterText_0 = null;

        EObject this_HeaderFooterDate_1 = null;

        EObject this_HeaderFooterPageNumber_2 = null;

        EObject this_HeaderFooterLookup_3 = null;

        EObject this_HeaderFooterTitle_4 = null;

        EObject this_HeaderFooterCommemoration_5 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:926:28: ( (this_HeaderFooterText_0= ruleHeaderFooterText | this_HeaderFooterDate_1= ruleHeaderFooterDate | this_HeaderFooterPageNumber_2= ruleHeaderFooterPageNumber | this_HeaderFooterLookup_3= ruleHeaderFooterLookup | this_HeaderFooterTitle_4= ruleHeaderFooterTitle | this_HeaderFooterCommemoration_5= ruleHeaderFooterCommemoration ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:927:1: (this_HeaderFooterText_0= ruleHeaderFooterText | this_HeaderFooterDate_1= ruleHeaderFooterDate | this_HeaderFooterPageNumber_2= ruleHeaderFooterPageNumber | this_HeaderFooterLookup_3= ruleHeaderFooterLookup | this_HeaderFooterTitle_4= ruleHeaderFooterTitle | this_HeaderFooterCommemoration_5= ruleHeaderFooterCommemoration )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:927:1: (this_HeaderFooterText_0= ruleHeaderFooterText | this_HeaderFooterDate_1= ruleHeaderFooterDate | this_HeaderFooterPageNumber_2= ruleHeaderFooterPageNumber | this_HeaderFooterLookup_3= ruleHeaderFooterLookup | this_HeaderFooterTitle_4= ruleHeaderFooterTitle | this_HeaderFooterCommemoration_5= ruleHeaderFooterCommemoration )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt19=1;
                }
                break;
            case 35:
                {
                alt19=2;
                }
                break;
            case 37:
                {
                alt19=3;
                }
                break;
            case 38:
                {
                alt19=4;
                }
                break;
            case 39:
                {
                alt19=5;
                }
                break;
            case 40:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:928:5: this_HeaderFooterText_0= ruleHeaderFooterText
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterText_in_ruleHeaderFooterFragment2133);
                    this_HeaderFooterText_0=ruleHeaderFooterText();

                    state._fsp--;

                     
                            current = this_HeaderFooterText_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:938:5: this_HeaderFooterDate_1= ruleHeaderFooterDate
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterDateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterDate_in_ruleHeaderFooterFragment2160);
                    this_HeaderFooterDate_1=ruleHeaderFooterDate();

                    state._fsp--;

                     
                            current = this_HeaderFooterDate_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:948:5: this_HeaderFooterPageNumber_2= ruleHeaderFooterPageNumber
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterPageNumberParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterPageNumber_in_ruleHeaderFooterFragment2187);
                    this_HeaderFooterPageNumber_2=ruleHeaderFooterPageNumber();

                    state._fsp--;

                     
                            current = this_HeaderFooterPageNumber_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:958:5: this_HeaderFooterLookup_3= ruleHeaderFooterLookup
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterLookupParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterLookup_in_ruleHeaderFooterFragment2214);
                    this_HeaderFooterLookup_3=ruleHeaderFooterLookup();

                    state._fsp--;

                     
                            current = this_HeaderFooterLookup_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:968:5: this_HeaderFooterTitle_4= ruleHeaderFooterTitle
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterTitleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterTitle_in_ruleHeaderFooterFragment2241);
                    this_HeaderFooterTitle_4=ruleHeaderFooterTitle();

                    state._fsp--;

                     
                            current = this_HeaderFooterTitle_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:978:5: this_HeaderFooterCommemoration_5= ruleHeaderFooterCommemoration
                    {
                     
                            newCompositeNode(grammarAccess.getHeaderFooterFragmentAccess().getHeaderFooterCommemorationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleHeaderFooterCommemoration_in_ruleHeaderFooterFragment2268);
                    this_HeaderFooterCommemoration_5=ruleHeaderFooterCommemoration();

                    state._fsp--;

                     
                            current = this_HeaderFooterCommemoration_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterFragment"


    // $ANTLR start "entryRuleHeaderFooterText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:994:1: entryRuleHeaderFooterText returns [EObject current=null] : iv_ruleHeaderFooterText= ruleHeaderFooterText EOF ;
    public final EObject entryRuleHeaderFooterText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterText = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:995:2: (iv_ruleHeaderFooterText= ruleHeaderFooterText EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:996:2: iv_ruleHeaderFooterText= ruleHeaderFooterText EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterTextRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterText_in_entryRuleHeaderFooterText2303);
            iv_ruleHeaderFooterText=ruleHeaderFooterText();

            state._fsp--;

             current =iv_ruleHeaderFooterText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterText2313); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterText"


    // $ANTLR start "ruleHeaderFooterText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1003:1: ruleHeaderFooterText returns [EObject current=null] : (otherlv_0= '@text' ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHeaderFooterText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_HeaderFooterText_1_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1006:28: ( (otherlv_0= '@text' ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1007:1: (otherlv_0= '@text' ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1007:1: (otherlv_0= '@text' ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1007:3: otherlv_0= '@text' ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleHeaderFooterText2350); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderFooterTextAccess().getTextKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1011:1: ( (lv_dsl_HeaderFooterText_1_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1012:1: (lv_dsl_HeaderFooterText_1_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1012:1: (lv_dsl_HeaderFooterText_1_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1013:3: lv_dsl_HeaderFooterText_1_0= RULE_STRING
            {
            lv_dsl_HeaderFooterText_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHeaderFooterText2367); 

            			newLeafNode(lv_dsl_HeaderFooterText_1_0, grammarAccess.getHeaderFooterTextAccess().getDsl_HeaderFooterTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderFooterTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_HeaderFooterText",
                    		lv_dsl_HeaderFooterText_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterText"


    // $ANTLR start "entryRuleHeaderFooterDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1037:1: entryRuleHeaderFooterDate returns [EObject current=null] : iv_ruleHeaderFooterDate= ruleHeaderFooterDate EOF ;
    public final EObject entryRuleHeaderFooterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterDate = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1038:2: (iv_ruleHeaderFooterDate= ruleHeaderFooterDate EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1039:2: iv_ruleHeaderFooterDate= ruleHeaderFooterDate EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterDateRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterDate_in_entryRuleHeaderFooterDate2408);
            iv_ruleHeaderFooterDate=ruleHeaderFooterDate();

            state._fsp--;

             current =iv_ruleHeaderFooterDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterDate2418); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterDate"


    // $ANTLR start "ruleHeaderFooterDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1046:1: ruleHeaderFooterDate returns [EObject current=null] : ( ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) ) (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )? ) ;
    public final EObject ruleHeaderFooterDate() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_HeaderFooterDate_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_dsl_HeaderFooterDate_Language_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1049:28: ( ( ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) ) (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )? ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1050:1: ( ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) ) (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )? )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1050:1: ( ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) ) (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )? )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1050:2: ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) ) (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )?
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1050:2: ( (lv_dsl_HeaderFooterDate_0_0= '@date' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1051:1: (lv_dsl_HeaderFooterDate_0_0= '@date' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1051:1: (lv_dsl_HeaderFooterDate_0_0= '@date' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1052:3: lv_dsl_HeaderFooterDate_0_0= '@date'
            {
            lv_dsl_HeaderFooterDate_0_0=(Token)match(input,35,FOLLOW_35_in_ruleHeaderFooterDate2461); 

                    newLeafNode(lv_dsl_HeaderFooterDate_0_0, grammarAccess.getHeaderFooterDateAccess().getDsl_HeaderFooterDateDateKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderFooterDateRule());
            	        }
                   		setWithLastConsumed(current, "dsl_HeaderFooterDate", true, "@date");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1065:2: (otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1065:4: otherlv_1= 'lang' ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleHeaderFooterDate2487); 

                        	newLeafNode(otherlv_1, grammarAccess.getHeaderFooterDateAccess().getLangKeyword_1_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1069:1: ( (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1070:1: (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1070:1: (lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1071:3: lv_dsl_HeaderFooterDate_Language_2_0= ruleLanguage
                    {
                     
                    	        newCompositeNode(grammarAccess.getHeaderFooterDateAccess().getDsl_HeaderFooterDate_LanguageLanguageEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLanguage_in_ruleHeaderFooterDate2508);
                    lv_dsl_HeaderFooterDate_Language_2_0=ruleLanguage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHeaderFooterDateRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_HeaderFooterDate_Language",
                            		lv_dsl_HeaderFooterDate_Language_2_0, 
                            		"Language");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterDate"


    // $ANTLR start "entryRuleHeaderFooterPageNumber"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1095:1: entryRuleHeaderFooterPageNumber returns [EObject current=null] : iv_ruleHeaderFooterPageNumber= ruleHeaderFooterPageNumber EOF ;
    public final EObject entryRuleHeaderFooterPageNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterPageNumber = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1096:2: (iv_ruleHeaderFooterPageNumber= ruleHeaderFooterPageNumber EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1097:2: iv_ruleHeaderFooterPageNumber= ruleHeaderFooterPageNumber EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterPageNumberRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterPageNumber_in_entryRuleHeaderFooterPageNumber2546);
            iv_ruleHeaderFooterPageNumber=ruleHeaderFooterPageNumber();

            state._fsp--;

             current =iv_ruleHeaderFooterPageNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterPageNumber2556); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterPageNumber"


    // $ANTLR start "ruleHeaderFooterPageNumber"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1104:1: ruleHeaderFooterPageNumber returns [EObject current=null] : ( (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' ) ) ;
    public final EObject ruleHeaderFooterPageNumber() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_HeaderFooterPageNumber_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1107:28: ( ( (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1108:1: ( (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1108:1: ( (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1109:1: (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1109:1: (lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1110:3: lv_dsl_HeaderFooterPageNumber_0_0= '@pageNbr'
            {
            lv_dsl_HeaderFooterPageNumber_0_0=(Token)match(input,37,FOLLOW_37_in_ruleHeaderFooterPageNumber2598); 

                    newLeafNode(lv_dsl_HeaderFooterPageNumber_0_0, grammarAccess.getHeaderFooterPageNumberAccess().getDsl_HeaderFooterPageNumberPageNbrKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderFooterPageNumberRule());
            	        }
                   		setWithLastConsumed(current, "dsl_HeaderFooterPageNumber", true, "@pageNbr");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterPageNumber"


    // $ANTLR start "entryRuleHeaderFooterLookup"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1131:1: entryRuleHeaderFooterLookup returns [EObject current=null] : iv_ruleHeaderFooterLookup= ruleHeaderFooterLookup EOF ;
    public final EObject entryRuleHeaderFooterLookup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterLookup = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1132:2: (iv_ruleHeaderFooterLookup= ruleHeaderFooterLookup EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1133:2: iv_ruleHeaderFooterLookup= ruleHeaderFooterLookup EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterLookupRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterLookup_in_entryRuleHeaderFooterLookup2646);
            iv_ruleHeaderFooterLookup=ruleHeaderFooterLookup();

            state._fsp--;

             current =iv_ruleHeaderFooterLookup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterLookup2656); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterLookup"


    // $ANTLR start "ruleHeaderFooterLookup"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1140:1: ruleHeaderFooterLookup returns [EObject current=null] : (otherlv_0= '@lookup' ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )* otherlv_2= 'lang' ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) ) ) ;
    public final EObject ruleHeaderFooterLookup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_HeaderFooterLookup_Elements_1_0 = null;

        Enumerator lv_dsl_HeaderFooterLookup_Language_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1143:28: ( (otherlv_0= '@lookup' ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )* otherlv_2= 'lang' ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1144:1: (otherlv_0= '@lookup' ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )* otherlv_2= 'lang' ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1144:1: (otherlv_0= '@lookup' ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )* otherlv_2= 'lang' ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1144:3: otherlv_0= '@lookup' ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )* otherlv_2= 'lang' ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleHeaderFooterLookup2693); 

                	newLeafNode(otherlv_0, grammarAccess.getHeaderFooterLookupAccess().getLookupKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1148:1: ( (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==49||LA21_0==51||(LA21_0>=54 && LA21_0<=55)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1149:1: (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1149:1: (lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1150:3: lv_dsl_HeaderFooterLookup_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeaderFooterLookupAccess().getDsl_HeaderFooterLookup_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleHeaderFooterLookup2714);
            	    lv_dsl_HeaderFooterLookup_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeaderFooterLookupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_HeaderFooterLookup_Elements",
            	            		lv_dsl_HeaderFooterLookup_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleHeaderFooterLookup2727); 

                	newLeafNode(otherlv_2, grammarAccess.getHeaderFooterLookupAccess().getLangKeyword_2());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1170:1: ( (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1171:1: (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1171:1: (lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1172:3: lv_dsl_HeaderFooterLookup_Language_3_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getHeaderFooterLookupAccess().getDsl_HeaderFooterLookup_LanguageLanguageEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleHeaderFooterLookup2748);
            lv_dsl_HeaderFooterLookup_Language_3_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeaderFooterLookupRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_HeaderFooterLookup_Language",
                    		lv_dsl_HeaderFooterLookup_Language_3_0, 
                    		"Language");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterLookup"


    // $ANTLR start "entryRuleHeaderFooterTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1196:1: entryRuleHeaderFooterTitle returns [EObject current=null] : iv_ruleHeaderFooterTitle= ruleHeaderFooterTitle EOF ;
    public final EObject entryRuleHeaderFooterTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterTitle = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1197:2: (iv_ruleHeaderFooterTitle= ruleHeaderFooterTitle EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1198:2: iv_ruleHeaderFooterTitle= ruleHeaderFooterTitle EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterTitleRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterTitle_in_entryRuleHeaderFooterTitle2784);
            iv_ruleHeaderFooterTitle=ruleHeaderFooterTitle();

            state._fsp--;

             current =iv_ruleHeaderFooterTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterTitle2794); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterTitle"


    // $ANTLR start "ruleHeaderFooterTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1205:1: ruleHeaderFooterTitle returns [EObject current=null] : ( (lv_dsl_HeaderFooterTitle_0_0= '@title' ) ) ;
    public final EObject ruleHeaderFooterTitle() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_HeaderFooterTitle_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1208:28: ( ( (lv_dsl_HeaderFooterTitle_0_0= '@title' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1209:1: ( (lv_dsl_HeaderFooterTitle_0_0= '@title' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1209:1: ( (lv_dsl_HeaderFooterTitle_0_0= '@title' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1210:1: (lv_dsl_HeaderFooterTitle_0_0= '@title' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1210:1: (lv_dsl_HeaderFooterTitle_0_0= '@title' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1211:3: lv_dsl_HeaderFooterTitle_0_0= '@title'
            {
            lv_dsl_HeaderFooterTitle_0_0=(Token)match(input,39,FOLLOW_39_in_ruleHeaderFooterTitle2836); 

                    newLeafNode(lv_dsl_HeaderFooterTitle_0_0, grammarAccess.getHeaderFooterTitleAccess().getDsl_HeaderFooterTitleTitleKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderFooterTitleRule());
            	        }
                   		setWithLastConsumed(current, "dsl_HeaderFooterTitle", true, "@title");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterTitle"


    // $ANTLR start "entryRuleHeaderFooterCommemoration"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1232:1: entryRuleHeaderFooterCommemoration returns [EObject current=null] : iv_ruleHeaderFooterCommemoration= ruleHeaderFooterCommemoration EOF ;
    public final EObject entryRuleHeaderFooterCommemoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeaderFooterCommemoration = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1233:2: (iv_ruleHeaderFooterCommemoration= ruleHeaderFooterCommemoration EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1234:2: iv_ruleHeaderFooterCommemoration= ruleHeaderFooterCommemoration EOF
            {
             newCompositeNode(grammarAccess.getHeaderFooterCommemorationRule()); 
            pushFollow(FOLLOW_ruleHeaderFooterCommemoration_in_entryRuleHeaderFooterCommemoration2884);
            iv_ruleHeaderFooterCommemoration=ruleHeaderFooterCommemoration();

            state._fsp--;

             current =iv_ruleHeaderFooterCommemoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeaderFooterCommemoration2894); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeaderFooterCommemoration"


    // $ANTLR start "ruleHeaderFooterCommemoration"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1241:1: ruleHeaderFooterCommemoration returns [EObject current=null] : ( (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' ) ) ;
    public final EObject ruleHeaderFooterCommemoration() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_HeaderFooterCommemoration_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1244:28: ( ( (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1245:1: ( (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1245:1: ( (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1246:1: (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1246:1: (lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1247:3: lv_dsl_HeaderFooterCommemoration_0_0= '@commemoration'
            {
            lv_dsl_HeaderFooterCommemoration_0_0=(Token)match(input,40,FOLLOW_40_in_ruleHeaderFooterCommemoration2936); 

                    newLeafNode(lv_dsl_HeaderFooterCommemoration_0_0, grammarAccess.getHeaderFooterCommemorationAccess().getDsl_HeaderFooterCommemorationCommemorationKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderFooterCommemorationRule());
            	        }
                   		setWithLastConsumed(current, "dsl_HeaderFooterCommemoration", true, "@commemoration");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeaderFooterCommemoration"


    // $ANTLR start "entryRuleCommemoration"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1268:1: entryRuleCommemoration returns [EObject current=null] : iv_ruleCommemoration= ruleCommemoration EOF ;
    public final EObject entryRuleCommemoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommemoration = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1269:2: (iv_ruleCommemoration= ruleCommemoration EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1270:2: iv_ruleCommemoration= ruleCommemoration EOF
            {
             newCompositeNode(grammarAccess.getCommemorationRule()); 
            pushFollow(FOLLOW_ruleCommemoration_in_entryRuleCommemoration2984);
            iv_ruleCommemoration=ruleCommemoration();

            state._fsp--;

             current =iv_ruleCommemoration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommemoration2994); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommemoration"


    // $ANTLR start "ruleCommemoration"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1277:1: ruleCommemoration returns [EObject current=null] : (otherlv_0= 'Template_Commemoration' ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Template_Commemoration' ) ;
    public final EObject ruleCommemoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Commemoration_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1280:28: ( (otherlv_0= 'Template_Commemoration' ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Template_Commemoration' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1281:1: (otherlv_0= 'Template_Commemoration' ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Template_Commemoration' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1281:1: (otherlv_0= 'Template_Commemoration' ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Template_Commemoration' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1281:3: otherlv_0= 'Template_Commemoration' ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+ otherlv_2= 'End_Template_Commemoration'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleCommemoration3031); 

                	newLeafNode(otherlv_0, grammarAccess.getCommemorationAccess().getTemplate_CommemorationKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1285:1: ( (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=34 && LA22_0<=35)||(LA22_0>=37 && LA22_0<=40)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1286:1: (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1286:1: (lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1287:3: lv_dsl_Commemoration_Elements_1_0= ruleHeaderFooterFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCommemorationAccess().getDsl_Commemoration_ElementsHeaderFooterFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeaderFooterFragment_in_ruleCommemoration3052);
            	    lv_dsl_Commemoration_Elements_1_0=ruleHeaderFooterFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCommemorationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Commemoration_Elements",
            	            		lv_dsl_Commemoration_Elements_1_0, 
            	            		"HeaderFooterFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleCommemoration3065); 

                	newLeafNode(otherlv_2, grammarAccess.getCommemorationAccess().getEnd_Template_CommemorationKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommemoration"


    // $ANTLR start "entryRuleTemplateStatus"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1315:1: entryRuleTemplateStatus returns [EObject current=null] : iv_ruleTemplateStatus= ruleTemplateStatus EOF ;
    public final EObject entryRuleTemplateStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateStatus = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1316:2: (iv_ruleTemplateStatus= ruleTemplateStatus EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1317:2: iv_ruleTemplateStatus= ruleTemplateStatus EOF
            {
             newCompositeNode(grammarAccess.getTemplateStatusRule()); 
            pushFollow(FOLLOW_ruleTemplateStatus_in_entryRuleTemplateStatus3101);
            iv_ruleTemplateStatus=ruleTemplateStatus();

            state._fsp--;

             current =iv_ruleTemplateStatus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateStatus3111); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateStatus"


    // $ANTLR start "ruleTemplateStatus"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1324:1: ruleTemplateStatus returns [EObject current=null] : (otherlv_0= 'Status' ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) ) ) ;
    public final EObject ruleTemplateStatus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_dsl_TemplateStatus_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1327:28: ( (otherlv_0= 'Status' ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1328:1: (otherlv_0= 'Status' ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1328:1: (otherlv_0= 'Status' ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1328:3: otherlv_0= 'Status' ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleTemplateStatus3148); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateStatusAccess().getStatusKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1332:1: ( (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1333:1: (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1333:1: (lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1334:3: lv_dsl_TemplateStatus_1_0= ruleTemplateStatuses
            {
             
            	        newCompositeNode(grammarAccess.getTemplateStatusAccess().getDsl_TemplateStatusTemplateStatusesEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTemplateStatuses_in_ruleTemplateStatus3169);
            lv_dsl_TemplateStatus_1_0=ruleTemplateStatuses();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateStatusRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_TemplateStatus",
                    		lv_dsl_TemplateStatus_1_0, 
                    		"TemplateStatuses");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateStatus"


    // $ANTLR start "entryRuleAbstractComponent"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1358:1: entryRuleAbstractComponent returns [EObject current=null] : iv_ruleAbstractComponent= ruleAbstractComponent EOF ;
    public final EObject entryRuleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponent = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1359:2: (iv_ruleAbstractComponent= ruleAbstractComponent EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1360:2: iv_ruleAbstractComponent= ruleAbstractComponent EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentRule()); 
            pushFollow(FOLLOW_ruleAbstractComponent_in_entryRuleAbstractComponent3205);
            iv_ruleAbstractComponent=ruleAbstractComponent();

            state._fsp--;

             current =iv_ruleAbstractComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractComponent3215); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractComponent"


    // $ANTLR start "ruleAbstractComponent"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1367:1: ruleAbstractComponent returns [EObject current=null] : (this_Actor_0= ruleActor | this_Aid_1= ruleAid | this_Block_2= ruleBlock | this_Break_3= ruleBreak | this_Dialog_4= ruleDialog | this_Title_5= ruleTitle | this_Heading1_6= ruleHeading1 | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Hymn_9= ruleHymn | this_Media_10= ruleMedia | this_Info_11= ruleInfo | this_LitBook_12= ruleLitBook | this_Paragraph_13= ruleParagraph | this_PassThroughHtml_14= rulePassThroughHtml | this_PassThroughPdf_15= rulePassThroughPdf | this_Reading_16= ruleReading | this_RestoreLocale_17= ruleRestoreLocale | this_Rubric_18= ruleRubric | this_Section_19= ruleSection | this_SectionFragment_20= ruleSectionFragment | this_SetLocale_21= ruleSetLocale | this_TemplateFragment_22= ruleTemplateFragment | this_SubTitle_23= ruleSubTitle | this_Verse_24= ruleVerse | this_Version_25= ruleVersion | this_VersionSwitch_26= ruleVersionSwitch | this_WhenDate_27= ruleWhenDate | this_WhenDayName_28= ruleWhenDayName | this_WhenExists_29= ruleWhenExists | this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay | this_WhenModeOfWeek_31= ruleWhenModeOfWeek | this_WhenPascha_32= ruleWhenPascha | this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay | this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_36= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion ) ;
    public final EObject ruleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Aid_1 = null;

        EObject this_Block_2 = null;

        EObject this_Break_3 = null;

        EObject this_Dialog_4 = null;

        EObject this_Title_5 = null;

        EObject this_Heading1_6 = null;

        EObject this_Heading2_7 = null;

        EObject this_Heading3_8 = null;

        EObject this_Hymn_9 = null;

        EObject this_Media_10 = null;

        EObject this_Info_11 = null;

        EObject this_LitBook_12 = null;

        EObject this_Paragraph_13 = null;

        EObject this_PassThroughHtml_14 = null;

        EObject this_PassThroughPdf_15 = null;

        EObject this_Reading_16 = null;

        EObject this_RestoreLocale_17 = null;

        EObject this_Rubric_18 = null;

        EObject this_Section_19 = null;

        EObject this_SectionFragment_20 = null;

        EObject this_SetLocale_21 = null;

        EObject this_TemplateFragment_22 = null;

        EObject this_SubTitle_23 = null;

        EObject this_Verse_24 = null;

        EObject this_Version_25 = null;

        EObject this_VersionSwitch_26 = null;

        EObject this_WhenDate_27 = null;

        EObject this_WhenDayName_28 = null;

        EObject this_WhenExists_29 = null;

        EObject this_WhenLukanCycleDay_30 = null;

        EObject this_WhenModeOfWeek_31 = null;

        EObject this_WhenPascha_32 = null;

        EObject this_WhenMovableCycleDay_33 = null;

        EObject this_WhenPentecostarionDay_34 = null;

        EObject this_WhenSundayAfterElevationOfCrossDay_35 = null;

        EObject this_WhenTriodionDay_36 = null;

        EObject this_WhenSundaysBeforeTriodion_37 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1370:28: ( (this_Actor_0= ruleActor | this_Aid_1= ruleAid | this_Block_2= ruleBlock | this_Break_3= ruleBreak | this_Dialog_4= ruleDialog | this_Title_5= ruleTitle | this_Heading1_6= ruleHeading1 | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Hymn_9= ruleHymn | this_Media_10= ruleMedia | this_Info_11= ruleInfo | this_LitBook_12= ruleLitBook | this_Paragraph_13= ruleParagraph | this_PassThroughHtml_14= rulePassThroughHtml | this_PassThroughPdf_15= rulePassThroughPdf | this_Reading_16= ruleReading | this_RestoreLocale_17= ruleRestoreLocale | this_Rubric_18= ruleRubric | this_Section_19= ruleSection | this_SectionFragment_20= ruleSectionFragment | this_SetLocale_21= ruleSetLocale | this_TemplateFragment_22= ruleTemplateFragment | this_SubTitle_23= ruleSubTitle | this_Verse_24= ruleVerse | this_Version_25= ruleVersion | this_VersionSwitch_26= ruleVersionSwitch | this_WhenDate_27= ruleWhenDate | this_WhenDayName_28= ruleWhenDayName | this_WhenExists_29= ruleWhenExists | this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay | this_WhenModeOfWeek_31= ruleWhenModeOfWeek | this_WhenPascha_32= ruleWhenPascha | this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay | this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_36= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1371:1: (this_Actor_0= ruleActor | this_Aid_1= ruleAid | this_Block_2= ruleBlock | this_Break_3= ruleBreak | this_Dialog_4= ruleDialog | this_Title_5= ruleTitle | this_Heading1_6= ruleHeading1 | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Hymn_9= ruleHymn | this_Media_10= ruleMedia | this_Info_11= ruleInfo | this_LitBook_12= ruleLitBook | this_Paragraph_13= ruleParagraph | this_PassThroughHtml_14= rulePassThroughHtml | this_PassThroughPdf_15= rulePassThroughPdf | this_Reading_16= ruleReading | this_RestoreLocale_17= ruleRestoreLocale | this_Rubric_18= ruleRubric | this_Section_19= ruleSection | this_SectionFragment_20= ruleSectionFragment | this_SetLocale_21= ruleSetLocale | this_TemplateFragment_22= ruleTemplateFragment | this_SubTitle_23= ruleSubTitle | this_Verse_24= ruleVerse | this_Version_25= ruleVersion | this_VersionSwitch_26= ruleVersionSwitch | this_WhenDate_27= ruleWhenDate | this_WhenDayName_28= ruleWhenDayName | this_WhenExists_29= ruleWhenExists | this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay | this_WhenModeOfWeek_31= ruleWhenModeOfWeek | this_WhenPascha_32= ruleWhenPascha | this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay | this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_36= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1371:1: (this_Actor_0= ruleActor | this_Aid_1= ruleAid | this_Block_2= ruleBlock | this_Break_3= ruleBreak | this_Dialog_4= ruleDialog | this_Title_5= ruleTitle | this_Heading1_6= ruleHeading1 | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Hymn_9= ruleHymn | this_Media_10= ruleMedia | this_Info_11= ruleInfo | this_LitBook_12= ruleLitBook | this_Paragraph_13= ruleParagraph | this_PassThroughHtml_14= rulePassThroughHtml | this_PassThroughPdf_15= rulePassThroughPdf | this_Reading_16= ruleReading | this_RestoreLocale_17= ruleRestoreLocale | this_Rubric_18= ruleRubric | this_Section_19= ruleSection | this_SectionFragment_20= ruleSectionFragment | this_SetLocale_21= ruleSetLocale | this_TemplateFragment_22= ruleTemplateFragment | this_SubTitle_23= ruleSubTitle | this_Verse_24= ruleVerse | this_Version_25= ruleVersion | this_VersionSwitch_26= ruleVersionSwitch | this_WhenDate_27= ruleWhenDate | this_WhenDayName_28= ruleWhenDayName | this_WhenExists_29= ruleWhenExists | this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay | this_WhenModeOfWeek_31= ruleWhenModeOfWeek | this_WhenPascha_32= ruleWhenPascha | this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay | this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_36= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion )
            int alt23=38;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1372:5: this_Actor_0= ruleActor
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getActorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleAbstractComponent3262);
                    this_Actor_0=ruleActor();

                    state._fsp--;

                     
                            current = this_Actor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1382:5: this_Aid_1= ruleAid
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getAidParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAid_in_ruleAbstractComponent3289);
                    this_Aid_1=ruleAid();

                    state._fsp--;

                     
                            current = this_Aid_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1392:5: this_Block_2= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getBlockParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleAbstractComponent3316);
                    this_Block_2=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1402:5: this_Break_3= ruleBreak
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getBreakParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleBreak_in_ruleAbstractComponent3343);
                    this_Break_3=ruleBreak();

                    state._fsp--;

                     
                            current = this_Break_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1412:5: this_Dialog_4= ruleDialog
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getDialogParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDialog_in_ruleAbstractComponent3370);
                    this_Dialog_4=ruleDialog();

                    state._fsp--;

                     
                            current = this_Dialog_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1422:5: this_Title_5= ruleTitle
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getTitleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTitle_in_ruleAbstractComponent3397);
                    this_Title_5=ruleTitle();

                    state._fsp--;

                     
                            current = this_Title_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1432:5: this_Heading1_6= ruleHeading1
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getHeading1ParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleHeading1_in_ruleAbstractComponent3424);
                    this_Heading1_6=ruleHeading1();

                    state._fsp--;

                     
                            current = this_Heading1_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1442:5: this_Heading2_7= ruleHeading2
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getHeading2ParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleHeading2_in_ruleAbstractComponent3451);
                    this_Heading2_7=ruleHeading2();

                    state._fsp--;

                     
                            current = this_Heading2_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1452:5: this_Heading3_8= ruleHeading3
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getHeading3ParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleHeading3_in_ruleAbstractComponent3478);
                    this_Heading3_8=ruleHeading3();

                    state._fsp--;

                     
                            current = this_Heading3_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1462:5: this_Hymn_9= ruleHymn
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getHymnParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleHymn_in_ruleAbstractComponent3505);
                    this_Hymn_9=ruleHymn();

                    state._fsp--;

                     
                            current = this_Hymn_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1472:5: this_Media_10= ruleMedia
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getMediaParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleMedia_in_ruleAbstractComponent3532);
                    this_Media_10=ruleMedia();

                    state._fsp--;

                     
                            current = this_Media_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1482:5: this_Info_11= ruleInfo
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getInfoParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleInfo_in_ruleAbstractComponent3559);
                    this_Info_11=ruleInfo();

                    state._fsp--;

                     
                            current = this_Info_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1492:5: this_LitBook_12= ruleLitBook
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getLitBookParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleLitBook_in_ruleAbstractComponent3586);
                    this_LitBook_12=ruleLitBook();

                    state._fsp--;

                     
                            current = this_LitBook_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1502:5: this_Paragraph_13= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getParagraphParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_ruleAbstractComponent3613);
                    this_Paragraph_13=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1512:5: this_PassThroughHtml_14= rulePassThroughHtml
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getPassThroughHtmlParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_rulePassThroughHtml_in_ruleAbstractComponent3640);
                    this_PassThroughHtml_14=rulePassThroughHtml();

                    state._fsp--;

                     
                            current = this_PassThroughHtml_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1522:5: this_PassThroughPdf_15= rulePassThroughPdf
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getPassThroughPdfParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_rulePassThroughPdf_in_ruleAbstractComponent3667);
                    this_PassThroughPdf_15=rulePassThroughPdf();

                    state._fsp--;

                     
                            current = this_PassThroughPdf_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1532:5: this_Reading_16= ruleReading
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getReadingParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleReading_in_ruleAbstractComponent3694);
                    this_Reading_16=ruleReading();

                    state._fsp--;

                     
                            current = this_Reading_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1542:5: this_RestoreLocale_17= ruleRestoreLocale
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getRestoreLocaleParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleRestoreLocale_in_ruleAbstractComponent3721);
                    this_RestoreLocale_17=ruleRestoreLocale();

                    state._fsp--;

                     
                            current = this_RestoreLocale_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1552:5: this_Rubric_18= ruleRubric
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getRubricParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleRubric_in_ruleAbstractComponent3748);
                    this_Rubric_18=ruleRubric();

                    state._fsp--;

                     
                            current = this_Rubric_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1562:5: this_Section_19= ruleSection
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getSectionParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleSection_in_ruleAbstractComponent3775);
                    this_Section_19=ruleSection();

                    state._fsp--;

                     
                            current = this_Section_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1572:5: this_SectionFragment_20= ruleSectionFragment
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getSectionFragmentParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleSectionFragment_in_ruleAbstractComponent3802);
                    this_SectionFragment_20=ruleSectionFragment();

                    state._fsp--;

                     
                            current = this_SectionFragment_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1582:5: this_SetLocale_21= ruleSetLocale
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getSetLocaleParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleSetLocale_in_ruleAbstractComponent3829);
                    this_SetLocale_21=ruleSetLocale();

                    state._fsp--;

                     
                            current = this_SetLocale_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1592:5: this_TemplateFragment_22= ruleTemplateFragment
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getTemplateFragmentParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_ruleTemplateFragment_in_ruleAbstractComponent3856);
                    this_TemplateFragment_22=ruleTemplateFragment();

                    state._fsp--;

                     
                            current = this_TemplateFragment_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1602:5: this_SubTitle_23= ruleSubTitle
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getSubTitleParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_ruleSubTitle_in_ruleAbstractComponent3883);
                    this_SubTitle_23=ruleSubTitle();

                    state._fsp--;

                     
                            current = this_SubTitle_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1612:5: this_Verse_24= ruleVerse
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getVerseParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleVerse_in_ruleAbstractComponent3910);
                    this_Verse_24=ruleVerse();

                    state._fsp--;

                     
                            current = this_Verse_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1622:5: this_Version_25= ruleVersion
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getVersionParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleVersion_in_ruleAbstractComponent3937);
                    this_Version_25=ruleVersion();

                    state._fsp--;

                     
                            current = this_Version_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1632:5: this_VersionSwitch_26= ruleVersionSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getVersionSwitchParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleVersionSwitch_in_ruleAbstractComponent3964);
                    this_VersionSwitch_26=ruleVersionSwitch();

                    state._fsp--;

                     
                            current = this_VersionSwitch_26; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 28 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1642:5: this_WhenDate_27= ruleWhenDate
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenDateParserRuleCall_27()); 
                        
                    pushFollow(FOLLOW_ruleWhenDate_in_ruleAbstractComponent3991);
                    this_WhenDate_27=ruleWhenDate();

                    state._fsp--;

                     
                            current = this_WhenDate_27; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 29 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1652:5: this_WhenDayName_28= ruleWhenDayName
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenDayNameParserRuleCall_28()); 
                        
                    pushFollow(FOLLOW_ruleWhenDayName_in_ruleAbstractComponent4018);
                    this_WhenDayName_28=ruleWhenDayName();

                    state._fsp--;

                     
                            current = this_WhenDayName_28; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 30 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1662:5: this_WhenExists_29= ruleWhenExists
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenExistsParserRuleCall_29()); 
                        
                    pushFollow(FOLLOW_ruleWhenExists_in_ruleAbstractComponent4045);
                    this_WhenExists_29=ruleWhenExists();

                    state._fsp--;

                     
                            current = this_WhenExists_29; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 31 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1672:5: this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenLukanCycleDayParserRuleCall_30()); 
                        
                    pushFollow(FOLLOW_ruleWhenLukanCycleDay_in_ruleAbstractComponent4072);
                    this_WhenLukanCycleDay_30=ruleWhenLukanCycleDay();

                    state._fsp--;

                     
                            current = this_WhenLukanCycleDay_30; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 32 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1682:5: this_WhenModeOfWeek_31= ruleWhenModeOfWeek
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenModeOfWeekParserRuleCall_31()); 
                        
                    pushFollow(FOLLOW_ruleWhenModeOfWeek_in_ruleAbstractComponent4099);
                    this_WhenModeOfWeek_31=ruleWhenModeOfWeek();

                    state._fsp--;

                     
                            current = this_WhenModeOfWeek_31; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 33 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1692:5: this_WhenPascha_32= ruleWhenPascha
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenPaschaParserRuleCall_32()); 
                        
                    pushFollow(FOLLOW_ruleWhenPascha_in_ruleAbstractComponent4126);
                    this_WhenPascha_32=ruleWhenPascha();

                    state._fsp--;

                     
                            current = this_WhenPascha_32; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 34 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1702:5: this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenMovableCycleDayParserRuleCall_33()); 
                        
                    pushFollow(FOLLOW_ruleWhenMovableCycleDay_in_ruleAbstractComponent4153);
                    this_WhenMovableCycleDay_33=ruleWhenMovableCycleDay();

                    state._fsp--;

                     
                            current = this_WhenMovableCycleDay_33; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 35 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1712:5: this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenPentecostarionDayParserRuleCall_34()); 
                        
                    pushFollow(FOLLOW_ruleWhenPentecostarionDay_in_ruleAbstractComponent4180);
                    this_WhenPentecostarionDay_34=ruleWhenPentecostarionDay();

                    state._fsp--;

                     
                            current = this_WhenPentecostarionDay_34; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 36 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1722:5: this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenSundayAfterElevationOfCrossDayParserRuleCall_35()); 
                        
                    pushFollow(FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_ruleAbstractComponent4207);
                    this_WhenSundayAfterElevationOfCrossDay_35=ruleWhenSundayAfterElevationOfCrossDay();

                    state._fsp--;

                     
                            current = this_WhenSundayAfterElevationOfCrossDay_35; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 37 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1732:5: this_WhenTriodionDay_36= ruleWhenTriodionDay
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenTriodionDayParserRuleCall_36()); 
                        
                    pushFollow(FOLLOW_ruleWhenTriodionDay_in_ruleAbstractComponent4234);
                    this_WhenTriodionDay_36=ruleWhenTriodionDay();

                    state._fsp--;

                     
                            current = this_WhenTriodionDay_36; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 38 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1742:5: this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractComponentAccess().getWhenSundaysBeforeTriodionParserRuleCall_37()); 
                        
                    pushFollow(FOLLOW_ruleWhenSundaysBeforeTriodion_in_ruleAbstractComponent4261);
                    this_WhenSundaysBeforeTriodion_37=ruleWhenSundaysBeforeTriodion();

                    state._fsp--;

                     
                            current = this_WhenSundaysBeforeTriodion_37; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractComponent"


    // $ANTLR start "entryRuleQualifiedName"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1758:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1759:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1760:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4297);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4308); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1767:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1770:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1771:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1771:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1771:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4348); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1778:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1779:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,44,FOLLOW_44_in_ruleQualifiedName4367); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4382); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1799:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1800:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1801:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard4430);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard4441); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1808:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1811:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1812:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1812:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1813:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard4488);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1823:1: (kw= '.*' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1824:2: kw= '.*'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleQualifiedNameWithWildCard4507); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleImport"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1837:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1838:2: (iv_ruleImport= ruleImport EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1839:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport4549);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport4559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1846:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1849:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1850:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1850:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1850:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleImport4596); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1854:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1855:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1855:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1856:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport4617);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildCard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleVersionSwitch"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1880:1: entryRuleVersionSwitch returns [EObject current=null] : iv_ruleVersionSwitch= ruleVersionSwitch EOF ;
    public final EObject entryRuleVersionSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionSwitch = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1881:2: (iv_ruleVersionSwitch= ruleVersionSwitch EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1882:2: iv_ruleVersionSwitch= ruleVersionSwitch EOF
            {
             newCompositeNode(grammarAccess.getVersionSwitchRule()); 
            pushFollow(FOLLOW_ruleVersionSwitch_in_entryRuleVersionSwitch4653);
            iv_ruleVersionSwitch=ruleVersionSwitch();

            state._fsp--;

             current =iv_ruleVersionSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersionSwitch4663); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersionSwitch"


    // $ANTLR start "ruleVersionSwitch"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1889:1: ruleVersionSwitch returns [EObject current=null] : (otherlv_0= 'Switch-Version' ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) ) otherlv_2= 'End-Switch-Version' ) ;
    public final EObject ruleVersionSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_dsl_VersionSwitch_flag_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1892:28: ( (otherlv_0= 'Switch-Version' ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) ) otherlv_2= 'End-Switch-Version' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1893:1: (otherlv_0= 'Switch-Version' ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) ) otherlv_2= 'End-Switch-Version' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1893:1: (otherlv_0= 'Switch-Version' ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) ) otherlv_2= 'End-Switch-Version' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1893:3: otherlv_0= 'Switch-Version' ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) ) otherlv_2= 'End-Switch-Version'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleVersionSwitch4700); 

                	newLeafNode(otherlv_0, grammarAccess.getVersionSwitchAccess().getSwitchVersionKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1897:1: ( (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1898:1: (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1898:1: (lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1899:3: lv_dsl_VersionSwitch_flag_1_0= ruleVersionSwitchType
            {
             
            	        newCompositeNode(grammarAccess.getVersionSwitchAccess().getDsl_VersionSwitch_flagVersionSwitchTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVersionSwitchType_in_ruleVersionSwitch4721);
            lv_dsl_VersionSwitch_flag_1_0=ruleVersionSwitchType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVersionSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_VersionSwitch_flag",
                    		lv_dsl_VersionSwitch_flag_1_0, 
                    		"VersionSwitchType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleVersionSwitch4733); 

                	newLeafNode(otherlv_2, grammarAccess.getVersionSwitchAccess().getEndSwitchVersionKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionSwitch"


    // $ANTLR start "entryRuleResourceText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1927:1: entryRuleResourceText returns [EObject current=null] : iv_ruleResourceText= ruleResourceText EOF ;
    public final EObject entryRuleResourceText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceText = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1928:2: (iv_ruleResourceText= ruleResourceText EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1929:2: iv_ruleResourceText= ruleResourceText EOF
            {
             newCompositeNode(grammarAccess.getResourceTextRule()); 
            pushFollow(FOLLOW_ruleResourceText_in_entryRuleResourceText4769);
            iv_ruleResourceText=ruleResourceText();

            state._fsp--;

             current =iv_ruleResourceText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceText4779); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResourceText"


    // $ANTLR start "ruleResourceText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1936:1: ruleResourceText returns [EObject current=null] : (otherlv_0= 'sid' ( ( ruleQualifiedName ) ) ( (lv_dsl_ResourceText_Media_Off_2_0= 'media-off' ) )? ) ;
    public final EObject ruleResourceText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_ResourceText_Media_Off_2_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1939:28: ( (otherlv_0= 'sid' ( ( ruleQualifiedName ) ) ( (lv_dsl_ResourceText_Media_Off_2_0= 'media-off' ) )? ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1940:1: (otherlv_0= 'sid' ( ( ruleQualifiedName ) ) ( (lv_dsl_ResourceText_Media_Off_2_0= 'media-off' ) )? )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1940:1: (otherlv_0= 'sid' ( ( ruleQualifiedName ) ) ( (lv_dsl_ResourceText_Media_Off_2_0= 'media-off' ) )? )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1940:3: otherlv_0= 'sid' ( ( ruleQualifiedName ) ) ( (lv_dsl_ResourceText_Media_Off_2_0= 'media-off' ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleResourceText4816); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceTextAccess().getSidKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1944:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1945:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1945:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1946:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceTextRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getResourceTextAccess().getDsl_ResourceTextRefDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleResourceText4839);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1959:2: ( (lv_dsl_ResourceText_Media_Off_2_0= 'media-off' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1960:1: (lv_dsl_ResourceText_Media_Off_2_0= 'media-off' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1960:1: (lv_dsl_ResourceText_Media_Off_2_0= 'media-off' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1961:3: lv_dsl_ResourceText_Media_Off_2_0= 'media-off'
                    {
                    lv_dsl_ResourceText_Media_Off_2_0=(Token)match(input,50,FOLLOW_50_in_ruleResourceText4857); 

                            newLeafNode(lv_dsl_ResourceText_Media_Off_2_0, grammarAccess.getResourceTextAccess().getDsl_ResourceText_Media_OffMediaOffKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceTextRule());
                    	        }
                           		setWithLastConsumed(current, "dsl_ResourceText_Media_Off", true, "media-off");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceText"


    // $ANTLR start "entryRuleLookup"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1982:1: entryRuleLookup returns [EObject current=null] : iv_ruleLookup= ruleLookup EOF ;
    public final EObject entryRuleLookup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookup = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1983:2: (iv_ruleLookup= ruleLookup EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1984:2: iv_ruleLookup= ruleLookup EOF
            {
             newCompositeNode(grammarAccess.getLookupRule()); 
            pushFollow(FOLLOW_ruleLookup_in_entryRuleLookup4907);
            iv_ruleLookup=ruleLookup();

            state._fsp--;

             current =iv_ruleLookup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLookup4917); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLookup"


    // $ANTLR start "ruleLookup"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1991:1: ruleLookup returns [EObject current=null] : (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) ( (lv_dsl_Lookup_Media_Off_2_0= 'media-off' ) )? ( ( (lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes ) ) )? ( ( (lv_dsl_Lookup_Override__Day_Set_5_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes ) ) )? ) ;
    public final EObject ruleLookup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_Lookup_Media_Off_2_0=null;
        Token lv_dsl_Lookup_Override_Mode_Set_3_0=null;
        Token lv_dsl_Lookup_Override__Day_Set_5_0=null;
        Enumerator lv_dsl_Lookup_OverrideMode_4_0 = null;

        Enumerator lv_dsl_Lookup_OverrideDay_6_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1994:28: ( (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) ( (lv_dsl_Lookup_Media_Off_2_0= 'media-off' ) )? ( ( (lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes ) ) )? ( ( (lv_dsl_Lookup_Override__Day_Set_5_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes ) ) )? ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1995:1: (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) ( (lv_dsl_Lookup_Media_Off_2_0= 'media-off' ) )? ( ( (lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes ) ) )? ( ( (lv_dsl_Lookup_Override__Day_Set_5_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes ) ) )? )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1995:1: (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) ( (lv_dsl_Lookup_Media_Off_2_0= 'media-off' ) )? ( ( (lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes ) ) )? ( ( (lv_dsl_Lookup_Override__Day_Set_5_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes ) ) )? )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1995:3: otherlv_0= 'rid' ( ( ruleQualifiedName ) ) ( (lv_dsl_Lookup_Media_Off_2_0= 'media-off' ) )? ( ( (lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes ) ) )? ( ( (lv_dsl_Lookup_Override__Day_Set_5_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes ) ) )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleLookup4954); 

                	newLeafNode(otherlv_0, grammarAccess.getLookupAccess().getRidKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:1999:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2000:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2000:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2001:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLookupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLookupAccess().getDsl_ResourceTextRefDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLookup4977);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2014:2: ( (lv_dsl_Lookup_Media_Off_2_0= 'media-off' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2015:1: (lv_dsl_Lookup_Media_Off_2_0= 'media-off' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2015:1: (lv_dsl_Lookup_Media_Off_2_0= 'media-off' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2016:3: lv_dsl_Lookup_Media_Off_2_0= 'media-off'
                    {
                    lv_dsl_Lookup_Media_Off_2_0=(Token)match(input,50,FOLLOW_50_in_ruleLookup4995); 

                            newLeafNode(lv_dsl_Lookup_Media_Off_2_0, grammarAccess.getLookupAccess().getDsl_Lookup_Media_OffMediaOffKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookupRule());
                    	        }
                           		setWithLastConsumed(current, "dsl_Lookup_Media_Off", true, "media-off");
                    	    

                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2029:3: ( ( (lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2029:4: ( (lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode' ) ) ( (lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes ) )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2029:4: ( (lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode' ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2030:1: (lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2030:1: (lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2031:3: lv_dsl_Lookup_Override_Mode_Set_3_0= '@mode'
                    {
                    lv_dsl_Lookup_Override_Mode_Set_3_0=(Token)match(input,52,FOLLOW_52_in_ruleLookup5028); 

                            newLeafNode(lv_dsl_Lookup_Override_Mode_Set_3_0, grammarAccess.getLookupAccess().getDsl_Lookup_Override_Mode_SetModeKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookupRule());
                    	        }
                           		setWithLastConsumed(current, "dsl_Lookup_Override_Mode_Set", true, "@mode");
                    	    

                    }


                    }

                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2044:2: ( (lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2045:1: (lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2045:1: (lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2046:3: lv_dsl_Lookup_OverrideMode_4_0= ruleModeTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getLookupAccess().getDsl_Lookup_OverrideModeModeTypesEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModeTypes_in_ruleLookup5062);
                    lv_dsl_Lookup_OverrideMode_4_0=ruleModeTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLookupRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Lookup_OverrideMode",
                            		lv_dsl_Lookup_OverrideMode_4_0, 
                            		"ModeTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2062:4: ( ( (lv_dsl_Lookup_Override__Day_Set_5_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2062:5: ( (lv_dsl_Lookup_Override__Day_Set_5_0= '@day' ) ) ( (lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes ) )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2062:5: ( (lv_dsl_Lookup_Override__Day_Set_5_0= '@day' ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2063:1: (lv_dsl_Lookup_Override__Day_Set_5_0= '@day' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2063:1: (lv_dsl_Lookup_Override__Day_Set_5_0= '@day' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2064:3: lv_dsl_Lookup_Override__Day_Set_5_0= '@day'
                    {
                    lv_dsl_Lookup_Override__Day_Set_5_0=(Token)match(input,53,FOLLOW_53_in_ruleLookup5083); 

                            newLeafNode(lv_dsl_Lookup_Override__Day_Set_5_0, grammarAccess.getLookupAccess().getDsl_Lookup_Override__Day_SetDayKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLookupRule());
                    	        }
                           		setWithLastConsumed(current, "dsl_Lookup_Override__Day_Set", true, "@day");
                    	    

                    }


                    }

                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2077:2: ( (lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2078:1: (lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2078:1: (lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2079:3: lv_dsl_Lookup_OverrideDay_6_0= ruleDowTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getLookupAccess().getDsl_Lookup_OverrideDayDowTypesEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDowTypes_in_ruleLookup5117);
                    lv_dsl_Lookup_OverrideDay_6_0=ruleDowTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLookupRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_Lookup_OverrideDay",
                            		lv_dsl_Lookup_OverrideDay_6_0, 
                            		"DowTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLookup"


    // $ANTLR start "entryRuleLDP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2103:1: entryRuleLDP returns [EObject current=null] : iv_ruleLDP= ruleLDP EOF ;
    public final EObject entryRuleLDP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLDP = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2104:2: (iv_ruleLDP= ruleLDP EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2105:2: iv_ruleLDP= ruleLDP EOF
            {
             newCompositeNode(grammarAccess.getLDPRule()); 
            pushFollow(FOLLOW_ruleLDP_in_entryRuleLDP5155);
            iv_ruleLDP=ruleLDP();

            state._fsp--;

             current =iv_ruleLDP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLDP5165); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLDP"


    // $ANTLR start "ruleLDP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2112:1: ruleLDP returns [EObject current=null] : (otherlv_0= 'ldp' ( (lv_dsl_LDP_1_0= ruleLdpType ) )* ) ;
    public final EObject ruleLDP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dsl_LDP_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2115:28: ( (otherlv_0= 'ldp' ( (lv_dsl_LDP_1_0= ruleLdpType ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2116:1: (otherlv_0= 'ldp' ( (lv_dsl_LDP_1_0= ruleLdpType ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2116:1: (otherlv_0= 'ldp' ( (lv_dsl_LDP_1_0= ruleLdpType ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2116:3: otherlv_0= 'ldp' ( (lv_dsl_LDP_1_0= ruleLdpType ) )*
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleLDP5202); 

                	newLeafNode(otherlv_0, grammarAccess.getLDPAccess().getLdpKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2120:1: ( (lv_dsl_LDP_1_0= ruleLdpType ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=70 && LA30_0<=86)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2121:1: (lv_dsl_LDP_1_0= ruleLdpType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2121:1: (lv_dsl_LDP_1_0= ruleLdpType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2122:3: lv_dsl_LDP_1_0= ruleLdpType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLDPAccess().getDsl_LDPLdpTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLdpType_in_ruleLDP5223);
            	    lv_dsl_LDP_1_0=ruleLdpType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLDPRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_LDP",
            	            		lv_dsl_LDP_1_0, 
            	            		"LdpType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLDP"


    // $ANTLR start "entryRuleTaggedText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2146:1: entryRuleTaggedText returns [EObject current=null] : iv_ruleTaggedText= ruleTaggedText EOF ;
    public final EObject entryRuleTaggedText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaggedText = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2147:2: (iv_ruleTaggedText= ruleTaggedText EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2148:2: iv_ruleTaggedText= ruleTaggedText EOF
            {
             newCompositeNode(grammarAccess.getTaggedTextRule()); 
            pushFollow(FOLLOW_ruleTaggedText_in_entryRuleTaggedText5260);
            iv_ruleTaggedText=ruleTaggedText();

            state._fsp--;

             current =iv_ruleTaggedText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaggedText5270); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaggedText"


    // $ANTLR start "ruleTaggedText"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2155:1: ruleTaggedText returns [EObject current=null] : (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ( (lv_dsl_TaggedText_3_0= ruleElementType ) )* otherlv_4= '</>' ) ;
    public final EObject ruleTaggedText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dsl_TaggedText_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2158:28: ( (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ( (lv_dsl_TaggedText_3_0= ruleElementType ) )* otherlv_4= '</>' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2159:1: (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ( (lv_dsl_TaggedText_3_0= ruleElementType ) )* otherlv_4= '</>' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2159:1: (otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ( (lv_dsl_TaggedText_3_0= ruleElementType ) )* otherlv_4= '</>' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2159:3: otherlv_0= '<' ( ( ruleQualifiedName ) ) otherlv_2= '>' ( (lv_dsl_TaggedText_3_0= ruleElementType ) )* otherlv_4= '</>'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleTaggedText5307); 

                	newLeafNode(otherlv_0, grammarAccess.getTaggedTextAccess().getLessThanSignKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2163:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2164:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2164:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2165:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTaggedTextRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTaggedTextAccess().getDsl_TaggedText_tagDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTaggedText5330);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleTaggedText5342); 

                	newLeafNode(otherlv_2, grammarAccess.getTaggedTextAccess().getGreaterThanSignKeyword_2());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2182:1: ( (lv_dsl_TaggedText_3_0= ruleElementType ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==49||LA31_0==51||(LA31_0>=54 && LA31_0<=55)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2183:1: (lv_dsl_TaggedText_3_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2183:1: (lv_dsl_TaggedText_3_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2184:3: lv_dsl_TaggedText_3_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaggedTextAccess().getDsl_TaggedTextElementTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleTaggedText5363);
            	    lv_dsl_TaggedText_3_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTaggedTextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_TaggedText",
            	            		lv_dsl_TaggedText_3_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,57,FOLLOW_57_in_ruleTaggedText5376); 

                	newLeafNode(otherlv_4, grammarAccess.getTaggedTextAccess().getLessThanSignSolidusGreaterThanSignKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaggedText"


    // $ANTLR start "entryRuleInfo"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2212:1: entryRuleInfo returns [EObject current=null] : iv_ruleInfo= ruleInfo EOF ;
    public final EObject entryRuleInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfo = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2213:2: (iv_ruleInfo= ruleInfo EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2214:2: iv_ruleInfo= ruleInfo EOF
            {
             newCompositeNode(grammarAccess.getInfoRule()); 
            pushFollow(FOLLOW_ruleInfo_in_entryRuleInfo5412);
            iv_ruleInfo=ruleInfo();

            state._fsp--;

             current =iv_ruleInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfo5422); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfo"


    // $ANTLR start "ruleInfo"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2221:1: ruleInfo returns [EObject current=null] : (otherlv_0= 'Info' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )* otherlv_3= 'End-Info' ) ;
    public final EObject ruleInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_Info_Elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2224:28: ( (otherlv_0= 'Info' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )* otherlv_3= 'End-Info' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2225:1: (otherlv_0= 'Info' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )* otherlv_3= 'End-Info' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2225:1: (otherlv_0= 'Info' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )* otherlv_3= 'End-Info' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2225:3: otherlv_0= 'Info' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )* otherlv_3= 'End-Info'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleInfo5459); 

                	newLeafNode(otherlv_0, grammarAccess.getInfoAccess().getInfoKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2229:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2230:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2230:1: (lv_name_1_0= RULE_ID )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2231:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInfo5476); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInfoAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInfoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2247:2: ( (lv_dsl_Info_Elements_2_0= ruleInfoElementType ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==47||LA32_0==97||LA32_0==99||LA32_0==101||LA32_0==103) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2248:1: (lv_dsl_Info_Elements_2_0= ruleInfoElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2248:1: (lv_dsl_Info_Elements_2_0= ruleInfoElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2249:3: lv_dsl_Info_Elements_2_0= ruleInfoElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInfoAccess().getDsl_Info_ElementsInfoElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInfoElementType_in_ruleInfo5502);
            	    lv_dsl_Info_Elements_2_0=ruleInfoElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInfoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Info_Elements",
            	            		lv_dsl_Info_Elements_2_0, 
            	            		"InfoElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleInfo5515); 

                	newLeafNode(otherlv_3, grammarAccess.getInfoAccess().getEndInfoKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfo"


    // $ANTLR start "entryRuleInfoElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2277:1: entryRuleInfoElementType returns [EObject current=null] : iv_ruleInfoElementType= ruleInfoElementType EOF ;
    public final EObject entryRuleInfoElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoElementType = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2278:2: (iv_ruleInfoElementType= ruleInfoElementType EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2279:2: iv_ruleInfoElementType= ruleInfoElementType EOF
            {
             newCompositeNode(grammarAccess.getInfoElementTypeRule()); 
            pushFollow(FOLLOW_ruleInfoElementType_in_entryRuleInfoElementType5551);
            iv_ruleInfoElementType=ruleInfoElementType();

            state._fsp--;

             current =iv_ruleInfoElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfoElementType5561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfoElementType"


    // $ANTLR start "ruleInfoElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2286:1: ruleInfoElementType returns [EObject current=null] : (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_SubTitle_3= ruleSubTitle | this_Title_4= ruleTitle ) ;
    public final EObject ruleInfoElementType() throws RecognitionException {
        EObject current = null;

        EObject this_VersionSwitch_0 = null;

        EObject this_Block_1 = null;

        EObject this_Paragraph_2 = null;

        EObject this_SubTitle_3 = null;

        EObject this_Title_4 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2289:28: ( (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_SubTitle_3= ruleSubTitle | this_Title_4= ruleTitle ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2290:1: (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_SubTitle_3= ruleSubTitle | this_Title_4= ruleTitle )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2290:1: (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_SubTitle_3= ruleSubTitle | this_Title_4= ruleTitle )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt33=1;
                }
                break;
            case 103:
                {
                alt33=2;
                }
                break;
            case 101:
                {
                alt33=3;
                }
                break;
            case 99:
                {
                alt33=4;
                }
                break;
            case 97:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2291:5: this_VersionSwitch_0= ruleVersionSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getInfoElementTypeAccess().getVersionSwitchParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVersionSwitch_in_ruleInfoElementType5608);
                    this_VersionSwitch_0=ruleVersionSwitch();

                    state._fsp--;

                     
                            current = this_VersionSwitch_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2301:5: this_Block_1= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getInfoElementTypeAccess().getBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleInfoElementType5635);
                    this_Block_1=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2311:5: this_Paragraph_2= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getInfoElementTypeAccess().getParagraphParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_ruleInfoElementType5662);
                    this_Paragraph_2=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2321:5: this_SubTitle_3= ruleSubTitle
                    {
                     
                            newCompositeNode(grammarAccess.getInfoElementTypeAccess().getSubTitleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSubTitle_in_ruleInfoElementType5689);
                    this_SubTitle_3=ruleSubTitle();

                    state._fsp--;

                     
                            current = this_SubTitle_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2331:5: this_Title_4= ruleTitle
                    {
                     
                            newCompositeNode(grammarAccess.getInfoElementTypeAccess().getTitleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTitle_in_ruleInfoElementType5716);
                    this_Title_4=ruleTitle();

                    state._fsp--;

                     
                            current = this_Title_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfoElementType"


    // $ANTLR start "entryRuleDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2347:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2348:2: (iv_ruleDate= ruleDate EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2349:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_ruleDate_in_entryRuleDate5751);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDate5761); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2356:1: ruleDate returns [EObject current=null] : (otherlv_0= 'Set_Date' otherlv_1= 'month' ( (lv_dsl_Date_month_2_0= RULE_INT ) ) otherlv_3= 'day' ( (lv_dsl_Date_day_4_0= RULE_INT ) ) (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )? otherlv_7= 'End_Date' ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_dsl_Date_month_2_0=null;
        Token otherlv_3=null;
        Token lv_dsl_Date_day_4_0=null;
        Token otherlv_5=null;
        Token lv_dsl_Date_year_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2359:28: ( (otherlv_0= 'Set_Date' otherlv_1= 'month' ( (lv_dsl_Date_month_2_0= RULE_INT ) ) otherlv_3= 'day' ( (lv_dsl_Date_day_4_0= RULE_INT ) ) (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )? otherlv_7= 'End_Date' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2360:1: (otherlv_0= 'Set_Date' otherlv_1= 'month' ( (lv_dsl_Date_month_2_0= RULE_INT ) ) otherlv_3= 'day' ( (lv_dsl_Date_day_4_0= RULE_INT ) ) (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )? otherlv_7= 'End_Date' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2360:1: (otherlv_0= 'Set_Date' otherlv_1= 'month' ( (lv_dsl_Date_month_2_0= RULE_INT ) ) otherlv_3= 'day' ( (lv_dsl_Date_day_4_0= RULE_INT ) ) (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )? otherlv_7= 'End_Date' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2360:3: otherlv_0= 'Set_Date' otherlv_1= 'month' ( (lv_dsl_Date_month_2_0= RULE_INT ) ) otherlv_3= 'day' ( (lv_dsl_Date_day_4_0= RULE_INT ) ) (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )? otherlv_7= 'End_Date'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleDate5798); 

                	newLeafNode(otherlv_0, grammarAccess.getDateAccess().getSet_DateKeyword_0());
                
            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleDate5810); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getMonthKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2368:1: ( (lv_dsl_Date_month_2_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2369:1: (lv_dsl_Date_month_2_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2369:1: (lv_dsl_Date_month_2_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2370:3: lv_dsl_Date_month_2_0= RULE_INT
            {
            lv_dsl_Date_month_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate5827); 

            			newLeafNode(lv_dsl_Date_month_2_0, grammarAccess.getDateAccess().getDsl_Date_monthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Date_month",
                    		lv_dsl_Date_month_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,62,FOLLOW_62_in_ruleDate5844); 

                	newLeafNode(otherlv_3, grammarAccess.getDateAccess().getDayKeyword_3());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2390:1: ( (lv_dsl_Date_day_4_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2391:1: (lv_dsl_Date_day_4_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2391:1: (lv_dsl_Date_day_4_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2392:3: lv_dsl_Date_day_4_0= RULE_INT
            {
            lv_dsl_Date_day_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate5861); 

            			newLeafNode(lv_dsl_Date_day_4_0, grammarAccess.getDateAccess().getDsl_Date_dayINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Date_day",
                    		lv_dsl_Date_day_4_0, 
                    		"INT");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2408:2: (otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==63) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2408:4: otherlv_5= 'year' ( (lv_dsl_Date_year_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,63,FOLLOW_63_in_ruleDate5879); 

                        	newLeafNode(otherlv_5, grammarAccess.getDateAccess().getYearKeyword_5_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2412:1: ( (lv_dsl_Date_year_6_0= RULE_INT ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2413:1: (lv_dsl_Date_year_6_0= RULE_INT )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2413:1: (lv_dsl_Date_year_6_0= RULE_INT )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2414:3: lv_dsl_Date_year_6_0= RULE_INT
                    {
                    lv_dsl_Date_year_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate5896); 

                    			newLeafNode(lv_dsl_Date_year_6_0, grammarAccess.getDateAccess().getDsl_Date_yearINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"dsl_Date_year",
                            		lv_dsl_Date_year_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,64,FOLLOW_64_in_ruleDate5915); 

                	newLeafNode(otherlv_7, grammarAccess.getDateAccess().getEnd_DateKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRulePreface"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2442:1: entryRulePreface returns [EObject current=null] : iv_rulePreface= rulePreface EOF ;
    public final EObject entryRulePreface() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreface = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2443:2: (iv_rulePreface= rulePreface EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2444:2: iv_rulePreface= rulePreface EOF
            {
             newCompositeNode(grammarAccess.getPrefaceRule()); 
            pushFollow(FOLLOW_rulePreface_in_entryRulePreface5951);
            iv_rulePreface=rulePreface();

            state._fsp--;

             current =iv_rulePreface; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePreface5961); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreface"


    // $ANTLR start "rulePreface"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2451:1: rulePreface returns [EObject current=null] : (otherlv_0= 'Preface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )* otherlv_3= 'End-Preface' ) ;
    public final EObject rulePreface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_Preface_Elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2454:28: ( (otherlv_0= 'Preface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )* otherlv_3= 'End-Preface' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2455:1: (otherlv_0= 'Preface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )* otherlv_3= 'End-Preface' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2455:1: (otherlv_0= 'Preface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )* otherlv_3= 'End-Preface' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2455:3: otherlv_0= 'Preface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )* otherlv_3= 'End-Preface'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_rulePreface5998); 

                	newLeafNode(otherlv_0, grammarAccess.getPrefaceAccess().getPrefaceKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2459:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2460:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2460:1: (lv_name_1_0= RULE_ID )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2461:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePreface6015); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrefaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrefaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2477:2: ( (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==47||LA35_0==67||LA35_0==87||LA35_0==89||LA35_0==97||LA35_0==99||LA35_0==101||LA35_0==103) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2478:1: (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2478:1: (lv_dsl_Preface_Elements_2_0= rulePrefaceElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2479:3: lv_dsl_Preface_Elements_2_0= rulePrefaceElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrefaceAccess().getDsl_Preface_ElementsPrefaceElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrefaceElementType_in_rulePreface6041);
            	    lv_dsl_Preface_Elements_2_0=rulePrefaceElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrefaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Preface_Elements",
            	            		lv_dsl_Preface_Elements_2_0, 
            	            		"PrefaceElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_3=(Token)match(input,66,FOLLOW_66_in_rulePreface6054); 

                	newLeafNode(otherlv_3, grammarAccess.getPrefaceAccess().getEndPrefaceKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreface"


    // $ANTLR start "entryRulePrefaceElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2507:1: entryRulePrefaceElementType returns [EObject current=null] : iv_rulePrefaceElementType= rulePrefaceElementType EOF ;
    public final EObject entryRulePrefaceElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefaceElementType = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2508:2: (iv_rulePrefaceElementType= rulePrefaceElementType EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2509:2: iv_rulePrefaceElementType= rulePrefaceElementType EOF
            {
             newCompositeNode(grammarAccess.getPrefaceElementTypeRule()); 
            pushFollow(FOLLOW_rulePrefaceElementType_in_entryRulePrefaceElementType6090);
            iv_rulePrefaceElementType=rulePrefaceElementType();

            state._fsp--;

             current =iv_rulePrefaceElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefaceElementType6100); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefaceElementType"


    // $ANTLR start "rulePrefaceElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2516:1: rulePrefaceElementType returns [EObject current=null] : (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_Section_3= ruleSection | this_SectionFragment_4= ruleSectionFragment | this_SubTitle_5= ruleSubTitle | this_TemplateFragment_6= ruleTemplateFragment | this_Title_7= ruleTitle ) ;
    public final EObject rulePrefaceElementType() throws RecognitionException {
        EObject current = null;

        EObject this_VersionSwitch_0 = null;

        EObject this_Block_1 = null;

        EObject this_Paragraph_2 = null;

        EObject this_Section_3 = null;

        EObject this_SectionFragment_4 = null;

        EObject this_SubTitle_5 = null;

        EObject this_TemplateFragment_6 = null;

        EObject this_Title_7 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2519:28: ( (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_Section_3= ruleSection | this_SectionFragment_4= ruleSectionFragment | this_SubTitle_5= ruleSubTitle | this_TemplateFragment_6= ruleTemplateFragment | this_Title_7= ruleTitle ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2520:1: (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_Section_3= ruleSection | this_SectionFragment_4= ruleSectionFragment | this_SubTitle_5= ruleSubTitle | this_TemplateFragment_6= ruleTemplateFragment | this_Title_7= ruleTitle )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2520:1: (this_VersionSwitch_0= ruleVersionSwitch | this_Block_1= ruleBlock | this_Paragraph_2= ruleParagraph | this_Section_3= ruleSection | this_SectionFragment_4= ruleSectionFragment | this_SubTitle_5= ruleSubTitle | this_TemplateFragment_6= ruleTemplateFragment | this_Title_7= ruleTitle )
            int alt36=8;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt36=1;
                }
                break;
            case 103:
                {
                alt36=2;
                }
                break;
            case 101:
                {
                alt36=3;
                }
                break;
            case 67:
                {
                alt36=4;
                }
                break;
            case 89:
                {
                alt36=5;
                }
                break;
            case 99:
                {
                alt36=6;
                }
                break;
            case 87:
                {
                alt36=7;
                }
                break;
            case 97:
                {
                alt36=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2521:5: this_VersionSwitch_0= ruleVersionSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getVersionSwitchParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVersionSwitch_in_rulePrefaceElementType6147);
                    this_VersionSwitch_0=ruleVersionSwitch();

                    state._fsp--;

                     
                            current = this_VersionSwitch_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2531:5: this_Block_1= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_rulePrefaceElementType6174);
                    this_Block_1=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2541:5: this_Paragraph_2= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getParagraphParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_rulePrefaceElementType6201);
                    this_Paragraph_2=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2551:5: this_Section_3= ruleSection
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getSectionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSection_in_rulePrefaceElementType6228);
                    this_Section_3=ruleSection();

                    state._fsp--;

                     
                            current = this_Section_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2561:5: this_SectionFragment_4= ruleSectionFragment
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getSectionFragmentParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSectionFragment_in_rulePrefaceElementType6255);
                    this_SectionFragment_4=ruleSectionFragment();

                    state._fsp--;

                     
                            current = this_SectionFragment_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2571:5: this_SubTitle_5= ruleSubTitle
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getSubTitleParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSubTitle_in_rulePrefaceElementType6282);
                    this_SubTitle_5=ruleSubTitle();

                    state._fsp--;

                     
                            current = this_SubTitle_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2581:5: this_TemplateFragment_6= ruleTemplateFragment
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getTemplateFragmentParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTemplateFragment_in_rulePrefaceElementType6309);
                    this_TemplateFragment_6=ruleTemplateFragment();

                    state._fsp--;

                     
                            current = this_TemplateFragment_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2591:5: this_Title_7= ruleTitle
                    {
                     
                            newCompositeNode(grammarAccess.getPrefaceElementTypeAccess().getTitleParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleTitle_in_rulePrefaceElementType6336);
                    this_Title_7=ruleTitle();

                    state._fsp--;

                     
                            current = this_Title_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefaceElementType"


    // $ANTLR start "entryRuleSection"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2607:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2608:2: (iv_ruleSection= ruleSection EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2609:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection6371);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection6381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2616:1: ruleSection returns [EObject current=null] : (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )* otherlv_5= 'End-Section' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_dsl_Section_Elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2619:28: ( (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )* otherlv_5= 'End-Section' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2620:1: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )* otherlv_5= 'End-Section' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2620:1: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )* otherlv_5= 'End-Section' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2620:3: otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )* otherlv_5= 'End-Section'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleSection6418); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2624:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2625:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2625:1: (lv_name_1_0= RULE_ID )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2626:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection6435); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2642:2: (otherlv_2= 'role' ( ( ruleQualifiedName ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==68) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2642:4: otherlv_2= 'role' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleSection6453); 

                        	newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getRoleKeyword_2_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2646:1: ( ( ruleQualifiedName ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2647:1: ( ruleQualifiedName )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2647:1: ( ruleQualifiedName )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2648:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSectionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSectionAccess().getDsl_Section_RoleDefinitionCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSection6476);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2661:4: ( (lv_dsl_Section_Elements_4_0= ruleSectionElementType ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==60||LA38_0==67||LA38_0==87||(LA38_0>=89 && LA38_0<=90)||LA38_0==94||LA38_0==97||LA38_0==99||LA38_0==101||LA38_0==103||LA38_0==105||LA38_0==107||LA38_0==109||LA38_0==111||LA38_0==113||LA38_0==115||LA38_0==117||LA38_0==119||LA38_0==121||LA38_0==123||LA38_0==128||(LA38_0>=132 && LA38_0<=133)||(LA38_0>=138 && LA38_0<=144)||(LA38_0>=146 && LA38_0<=148)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2662:1: (lv_dsl_Section_Elements_4_0= ruleSectionElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2662:1: (lv_dsl_Section_Elements_4_0= ruleSectionElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2663:3: lv_dsl_Section_Elements_4_0= ruleSectionElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSectionAccess().getDsl_Section_ElementsSectionElementTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSectionElementType_in_ruleSection6499);
            	    lv_dsl_Section_Elements_4_0=ruleSectionElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Section_Elements",
            	            		lv_dsl_Section_Elements_4_0, 
            	            		"SectionElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,69,FOLLOW_69_in_ruleSection6512); 

                	newLeafNode(otherlv_5, grammarAccess.getSectionAccess().getEndSectionKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2691:1: entryRuleSectionElementType returns [EObject current=null] : iv_ruleSectionElementType= ruleSectionElementType EOF ;
    public final EObject entryRuleSectionElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionElementType = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2692:2: (iv_ruleSectionElementType= ruleSectionElementType EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2693:2: iv_ruleSectionElementType= ruleSectionElementType EOF
            {
             newCompositeNode(grammarAccess.getSectionElementTypeRule()); 
            pushFollow(FOLLOW_ruleSectionElementType_in_entryRuleSectionElementType6548);
            iv_ruleSectionElementType=ruleSectionElementType();

            state._fsp--;

             current =iv_ruleSectionElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionElementType6558); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionElementType"


    // $ANTLR start "ruleSectionElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2700:1: ruleSectionElementType returns [EObject current=null] : (this_Actor_0= ruleActor | this_Block_1= ruleBlock | this_Break_2= ruleBreak | this_Date_3= ruleDate | this_Dialog_4= ruleDialog | this_Heading1_5= ruleHeading1 | this_Heading2_6= ruleHeading2 | this_Heading3_7= ruleHeading3 | this_Hymn_8= ruleHymn | this_Media_9= ruleMedia | this_Paragraph_10= ruleParagraph | this_PassThroughHtml_11= rulePassThroughHtml | this_PassThroughPdf_12= rulePassThroughPdf | this_Reading_13= ruleReading | this_RestoreLocale_14= ruleRestoreLocale | this_Rubric_15= ruleRubric | this_Section_16= ruleSection | this_SectionFragment_17= ruleSectionFragment | this_SetLocale_18= ruleSetLocale | this_TemplateFragment_19= ruleTemplateFragment | this_Title_20= ruleTitle | this_SubTitle_21= ruleSubTitle | this_Verse_22= ruleVerse | this_WhenDate_23= ruleWhenDate | this_WhenDayName_24= ruleWhenDayName | this_WhenExists_25= ruleWhenExists | this_WhenLukanCycleDay_26= ruleWhenLukanCycleDay | this_WhenModeOfWeek_27= ruleWhenModeOfWeek | this_WhenMovableCycleDay_28= ruleWhenMovableCycleDay | this_WhenPascha_29= ruleWhenPascha | this_WhenPentecostarionDay_30= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_31= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_32= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_33= ruleWhenSundaysBeforeTriodion ) ;
    public final EObject ruleSectionElementType() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_Block_1 = null;

        EObject this_Break_2 = null;

        EObject this_Date_3 = null;

        EObject this_Dialog_4 = null;

        EObject this_Heading1_5 = null;

        EObject this_Heading2_6 = null;

        EObject this_Heading3_7 = null;

        EObject this_Hymn_8 = null;

        EObject this_Media_9 = null;

        EObject this_Paragraph_10 = null;

        EObject this_PassThroughHtml_11 = null;

        EObject this_PassThroughPdf_12 = null;

        EObject this_Reading_13 = null;

        EObject this_RestoreLocale_14 = null;

        EObject this_Rubric_15 = null;

        EObject this_Section_16 = null;

        EObject this_SectionFragment_17 = null;

        EObject this_SetLocale_18 = null;

        EObject this_TemplateFragment_19 = null;

        EObject this_Title_20 = null;

        EObject this_SubTitle_21 = null;

        EObject this_Verse_22 = null;

        EObject this_WhenDate_23 = null;

        EObject this_WhenDayName_24 = null;

        EObject this_WhenExists_25 = null;

        EObject this_WhenLukanCycleDay_26 = null;

        EObject this_WhenModeOfWeek_27 = null;

        EObject this_WhenMovableCycleDay_28 = null;

        EObject this_WhenPascha_29 = null;

        EObject this_WhenPentecostarionDay_30 = null;

        EObject this_WhenSundayAfterElevationOfCrossDay_31 = null;

        EObject this_WhenTriodionDay_32 = null;

        EObject this_WhenSundaysBeforeTriodion_33 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2703:28: ( (this_Actor_0= ruleActor | this_Block_1= ruleBlock | this_Break_2= ruleBreak | this_Date_3= ruleDate | this_Dialog_4= ruleDialog | this_Heading1_5= ruleHeading1 | this_Heading2_6= ruleHeading2 | this_Heading3_7= ruleHeading3 | this_Hymn_8= ruleHymn | this_Media_9= ruleMedia | this_Paragraph_10= ruleParagraph | this_PassThroughHtml_11= rulePassThroughHtml | this_PassThroughPdf_12= rulePassThroughPdf | this_Reading_13= ruleReading | this_RestoreLocale_14= ruleRestoreLocale | this_Rubric_15= ruleRubric | this_Section_16= ruleSection | this_SectionFragment_17= ruleSectionFragment | this_SetLocale_18= ruleSetLocale | this_TemplateFragment_19= ruleTemplateFragment | this_Title_20= ruleTitle | this_SubTitle_21= ruleSubTitle | this_Verse_22= ruleVerse | this_WhenDate_23= ruleWhenDate | this_WhenDayName_24= ruleWhenDayName | this_WhenExists_25= ruleWhenExists | this_WhenLukanCycleDay_26= ruleWhenLukanCycleDay | this_WhenModeOfWeek_27= ruleWhenModeOfWeek | this_WhenMovableCycleDay_28= ruleWhenMovableCycleDay | this_WhenPascha_29= ruleWhenPascha | this_WhenPentecostarionDay_30= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_31= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_32= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_33= ruleWhenSundaysBeforeTriodion ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2704:1: (this_Actor_0= ruleActor | this_Block_1= ruleBlock | this_Break_2= ruleBreak | this_Date_3= ruleDate | this_Dialog_4= ruleDialog | this_Heading1_5= ruleHeading1 | this_Heading2_6= ruleHeading2 | this_Heading3_7= ruleHeading3 | this_Hymn_8= ruleHymn | this_Media_9= ruleMedia | this_Paragraph_10= ruleParagraph | this_PassThroughHtml_11= rulePassThroughHtml | this_PassThroughPdf_12= rulePassThroughPdf | this_Reading_13= ruleReading | this_RestoreLocale_14= ruleRestoreLocale | this_Rubric_15= ruleRubric | this_Section_16= ruleSection | this_SectionFragment_17= ruleSectionFragment | this_SetLocale_18= ruleSetLocale | this_TemplateFragment_19= ruleTemplateFragment | this_Title_20= ruleTitle | this_SubTitle_21= ruleSubTitle | this_Verse_22= ruleVerse | this_WhenDate_23= ruleWhenDate | this_WhenDayName_24= ruleWhenDayName | this_WhenExists_25= ruleWhenExists | this_WhenLukanCycleDay_26= ruleWhenLukanCycleDay | this_WhenModeOfWeek_27= ruleWhenModeOfWeek | this_WhenMovableCycleDay_28= ruleWhenMovableCycleDay | this_WhenPascha_29= ruleWhenPascha | this_WhenPentecostarionDay_30= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_31= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_32= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_33= ruleWhenSundaysBeforeTriodion )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2704:1: (this_Actor_0= ruleActor | this_Block_1= ruleBlock | this_Break_2= ruleBreak | this_Date_3= ruleDate | this_Dialog_4= ruleDialog | this_Heading1_5= ruleHeading1 | this_Heading2_6= ruleHeading2 | this_Heading3_7= ruleHeading3 | this_Hymn_8= ruleHymn | this_Media_9= ruleMedia | this_Paragraph_10= ruleParagraph | this_PassThroughHtml_11= rulePassThroughHtml | this_PassThroughPdf_12= rulePassThroughPdf | this_Reading_13= ruleReading | this_RestoreLocale_14= ruleRestoreLocale | this_Rubric_15= ruleRubric | this_Section_16= ruleSection | this_SectionFragment_17= ruleSectionFragment | this_SetLocale_18= ruleSetLocale | this_TemplateFragment_19= ruleTemplateFragment | this_Title_20= ruleTitle | this_SubTitle_21= ruleSubTitle | this_Verse_22= ruleVerse | this_WhenDate_23= ruleWhenDate | this_WhenDayName_24= ruleWhenDayName | this_WhenExists_25= ruleWhenExists | this_WhenLukanCycleDay_26= ruleWhenLukanCycleDay | this_WhenModeOfWeek_27= ruleWhenModeOfWeek | this_WhenMovableCycleDay_28= ruleWhenMovableCycleDay | this_WhenPascha_29= ruleWhenPascha | this_WhenPentecostarionDay_30= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_31= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_32= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_33= ruleWhenSundaysBeforeTriodion )
            int alt39=34;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2705:5: this_Actor_0= ruleActor
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getActorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleSectionElementType6605);
                    this_Actor_0=ruleActor();

                    state._fsp--;

                     
                            current = this_Actor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2715:5: this_Block_1= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleSectionElementType6632);
                    this_Block_1=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2725:5: this_Break_2= ruleBreak
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getBreakParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBreak_in_ruleSectionElementType6659);
                    this_Break_2=ruleBreak();

                    state._fsp--;

                     
                            current = this_Break_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2735:5: this_Date_3= ruleDate
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getDateParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDate_in_ruleSectionElementType6686);
                    this_Date_3=ruleDate();

                    state._fsp--;

                     
                            current = this_Date_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2745:5: this_Dialog_4= ruleDialog
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getDialogParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDialog_in_ruleSectionElementType6713);
                    this_Dialog_4=ruleDialog();

                    state._fsp--;

                     
                            current = this_Dialog_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2755:5: this_Heading1_5= ruleHeading1
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getHeading1ParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleHeading1_in_ruleSectionElementType6740);
                    this_Heading1_5=ruleHeading1();

                    state._fsp--;

                     
                            current = this_Heading1_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2765:5: this_Heading2_6= ruleHeading2
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getHeading2ParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleHeading2_in_ruleSectionElementType6767);
                    this_Heading2_6=ruleHeading2();

                    state._fsp--;

                     
                            current = this_Heading2_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2775:5: this_Heading3_7= ruleHeading3
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getHeading3ParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleHeading3_in_ruleSectionElementType6794);
                    this_Heading3_7=ruleHeading3();

                    state._fsp--;

                     
                            current = this_Heading3_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2785:5: this_Hymn_8= ruleHymn
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getHymnParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleHymn_in_ruleSectionElementType6821);
                    this_Hymn_8=ruleHymn();

                    state._fsp--;

                     
                            current = this_Hymn_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2795:5: this_Media_9= ruleMedia
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getMediaParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleMedia_in_ruleSectionElementType6848);
                    this_Media_9=ruleMedia();

                    state._fsp--;

                     
                            current = this_Media_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2805:5: this_Paragraph_10= ruleParagraph
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getParagraphParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleParagraph_in_ruleSectionElementType6875);
                    this_Paragraph_10=ruleParagraph();

                    state._fsp--;

                     
                            current = this_Paragraph_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2815:5: this_PassThroughHtml_11= rulePassThroughHtml
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getPassThroughHtmlParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_rulePassThroughHtml_in_ruleSectionElementType6902);
                    this_PassThroughHtml_11=rulePassThroughHtml();

                    state._fsp--;

                     
                            current = this_PassThroughHtml_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2825:5: this_PassThroughPdf_12= rulePassThroughPdf
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getPassThroughPdfParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_rulePassThroughPdf_in_ruleSectionElementType6929);
                    this_PassThroughPdf_12=rulePassThroughPdf();

                    state._fsp--;

                     
                            current = this_PassThroughPdf_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2835:5: this_Reading_13= ruleReading
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getReadingParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleReading_in_ruleSectionElementType6956);
                    this_Reading_13=ruleReading();

                    state._fsp--;

                     
                            current = this_Reading_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2845:5: this_RestoreLocale_14= ruleRestoreLocale
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getRestoreLocaleParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleRestoreLocale_in_ruleSectionElementType6983);
                    this_RestoreLocale_14=ruleRestoreLocale();

                    state._fsp--;

                     
                            current = this_RestoreLocale_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2855:5: this_Rubric_15= ruleRubric
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getRubricParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleRubric_in_ruleSectionElementType7010);
                    this_Rubric_15=ruleRubric();

                    state._fsp--;

                     
                            current = this_Rubric_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2865:5: this_Section_16= ruleSection
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getSectionParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleSection_in_ruleSectionElementType7037);
                    this_Section_16=ruleSection();

                    state._fsp--;

                     
                            current = this_Section_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2875:5: this_SectionFragment_17= ruleSectionFragment
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getSectionFragmentParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleSectionFragment_in_ruleSectionElementType7064);
                    this_SectionFragment_17=ruleSectionFragment();

                    state._fsp--;

                     
                            current = this_SectionFragment_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2885:5: this_SetLocale_18= ruleSetLocale
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getSetLocaleParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleSetLocale_in_ruleSectionElementType7091);
                    this_SetLocale_18=ruleSetLocale();

                    state._fsp--;

                     
                            current = this_SetLocale_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2895:5: this_TemplateFragment_19= ruleTemplateFragment
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getTemplateFragmentParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleTemplateFragment_in_ruleSectionElementType7118);
                    this_TemplateFragment_19=ruleTemplateFragment();

                    state._fsp--;

                     
                            current = this_TemplateFragment_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2905:5: this_Title_20= ruleTitle
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getTitleParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleTitle_in_ruleSectionElementType7145);
                    this_Title_20=ruleTitle();

                    state._fsp--;

                     
                            current = this_Title_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2915:5: this_SubTitle_21= ruleSubTitle
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getSubTitleParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleSubTitle_in_ruleSectionElementType7172);
                    this_SubTitle_21=ruleSubTitle();

                    state._fsp--;

                     
                            current = this_SubTitle_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2925:5: this_Verse_22= ruleVerse
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getVerseParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_ruleVerse_in_ruleSectionElementType7199);
                    this_Verse_22=ruleVerse();

                    state._fsp--;

                     
                            current = this_Verse_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2935:5: this_WhenDate_23= ruleWhenDate
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenDateParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_ruleWhenDate_in_ruleSectionElementType7226);
                    this_WhenDate_23=ruleWhenDate();

                    state._fsp--;

                     
                            current = this_WhenDate_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2945:5: this_WhenDayName_24= ruleWhenDayName
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenDayNameParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleWhenDayName_in_ruleSectionElementType7253);
                    this_WhenDayName_24=ruleWhenDayName();

                    state._fsp--;

                     
                            current = this_WhenDayName_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2955:5: this_WhenExists_25= ruleWhenExists
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenExistsParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleWhenExists_in_ruleSectionElementType7280);
                    this_WhenExists_25=ruleWhenExists();

                    state._fsp--;

                     
                            current = this_WhenExists_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2965:5: this_WhenLukanCycleDay_26= ruleWhenLukanCycleDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenLukanCycleDayParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleWhenLukanCycleDay_in_ruleSectionElementType7307);
                    this_WhenLukanCycleDay_26=ruleWhenLukanCycleDay();

                    state._fsp--;

                     
                            current = this_WhenLukanCycleDay_26; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 28 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2975:5: this_WhenModeOfWeek_27= ruleWhenModeOfWeek
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenModeOfWeekParserRuleCall_27()); 
                        
                    pushFollow(FOLLOW_ruleWhenModeOfWeek_in_ruleSectionElementType7334);
                    this_WhenModeOfWeek_27=ruleWhenModeOfWeek();

                    state._fsp--;

                     
                            current = this_WhenModeOfWeek_27; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 29 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2985:5: this_WhenMovableCycleDay_28= ruleWhenMovableCycleDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenMovableCycleDayParserRuleCall_28()); 
                        
                    pushFollow(FOLLOW_ruleWhenMovableCycleDay_in_ruleSectionElementType7361);
                    this_WhenMovableCycleDay_28=ruleWhenMovableCycleDay();

                    state._fsp--;

                     
                            current = this_WhenMovableCycleDay_28; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 30 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:2995:5: this_WhenPascha_29= ruleWhenPascha
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenPaschaParserRuleCall_29()); 
                        
                    pushFollow(FOLLOW_ruleWhenPascha_in_ruleSectionElementType7388);
                    this_WhenPascha_29=ruleWhenPascha();

                    state._fsp--;

                     
                            current = this_WhenPascha_29; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 31 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3005:5: this_WhenPentecostarionDay_30= ruleWhenPentecostarionDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenPentecostarionDayParserRuleCall_30()); 
                        
                    pushFollow(FOLLOW_ruleWhenPentecostarionDay_in_ruleSectionElementType7415);
                    this_WhenPentecostarionDay_30=ruleWhenPentecostarionDay();

                    state._fsp--;

                     
                            current = this_WhenPentecostarionDay_30; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 32 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3015:5: this_WhenSundayAfterElevationOfCrossDay_31= ruleWhenSundayAfterElevationOfCrossDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenSundayAfterElevationOfCrossDayParserRuleCall_31()); 
                        
                    pushFollow(FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_ruleSectionElementType7442);
                    this_WhenSundayAfterElevationOfCrossDay_31=ruleWhenSundayAfterElevationOfCrossDay();

                    state._fsp--;

                     
                            current = this_WhenSundayAfterElevationOfCrossDay_31; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 33 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3025:5: this_WhenTriodionDay_32= ruleWhenTriodionDay
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenTriodionDayParserRuleCall_32()); 
                        
                    pushFollow(FOLLOW_ruleWhenTriodionDay_in_ruleSectionElementType7469);
                    this_WhenTriodionDay_32=ruleWhenTriodionDay();

                    state._fsp--;

                     
                            current = this_WhenTriodionDay_32; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 34 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3035:5: this_WhenSundaysBeforeTriodion_33= ruleWhenSundaysBeforeTriodion
                    {
                     
                            newCompositeNode(grammarAccess.getSectionElementTypeAccess().getWhenSundaysBeforeTriodionParserRuleCall_33()); 
                        
                    pushFollow(FOLLOW_ruleWhenSundaysBeforeTriodion_in_ruleSectionElementType7496);
                    this_WhenSundaysBeforeTriodion_33=ruleWhenSundaysBeforeTriodion();

                    state._fsp--;

                     
                            current = this_WhenSundaysBeforeTriodion_33; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionElementType"


    // $ANTLR start "entryRuleLdpType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3051:1: entryRuleLdpType returns [EObject current=null] : iv_ruleLdpType= ruleLdpType EOF ;
    public final EObject entryRuleLdpType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLdpType = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3052:2: (iv_ruleLdpType= ruleLdpType EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3053:2: iv_ruleLdpType= ruleLdpType EOF
            {
             newCompositeNode(grammarAccess.getLdpTypeRule()); 
            pushFollow(FOLLOW_ruleLdpType_in_entryRuleLdpType7531);
            iv_ruleLdpType=ruleLdpType();

            state._fsp--;

             current =iv_ruleLdpType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLdpType7541); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLdpType"


    // $ANTLR start "ruleLdpType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3060:1: ruleLdpType returns [EObject current=null] : (this_DOM_0= ruleDOM | this_DOWN_1= ruleDOWN | this_DOWT_2= ruleDOWT | this_EOW_3= ruleEOW | this_All_4= ruleAll | this_GenDate_5= ruleGenDate | this_GenYear_6= ruleGenYear | this_MCD_7= ruleMCD | this_MOW_8= ruleMOW | this_NOP_9= ruleNOP | this_DOP_10= ruleDOP | this_SAEC_11= ruleSAEC | this_SOL_12= ruleSOL | this_DOL_13= ruleDOL | this_WOLC_14= ruleWOLC | this_WDOLC_15= ruleWDOLC | this_SBT_16= ruleSBT ) ;
    public final EObject ruleLdpType() throws RecognitionException {
        EObject current = null;

        EObject this_DOM_0 = null;

        EObject this_DOWN_1 = null;

        EObject this_DOWT_2 = null;

        EObject this_EOW_3 = null;

        EObject this_All_4 = null;

        EObject this_GenDate_5 = null;

        EObject this_GenYear_6 = null;

        EObject this_MCD_7 = null;

        EObject this_MOW_8 = null;

        EObject this_NOP_9 = null;

        EObject this_DOP_10 = null;

        EObject this_SAEC_11 = null;

        EObject this_SOL_12 = null;

        EObject this_DOL_13 = null;

        EObject this_WOLC_14 = null;

        EObject this_WDOLC_15 = null;

        EObject this_SBT_16 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3063:28: ( (this_DOM_0= ruleDOM | this_DOWN_1= ruleDOWN | this_DOWT_2= ruleDOWT | this_EOW_3= ruleEOW | this_All_4= ruleAll | this_GenDate_5= ruleGenDate | this_GenYear_6= ruleGenYear | this_MCD_7= ruleMCD | this_MOW_8= ruleMOW | this_NOP_9= ruleNOP | this_DOP_10= ruleDOP | this_SAEC_11= ruleSAEC | this_SOL_12= ruleSOL | this_DOL_13= ruleDOL | this_WOLC_14= ruleWOLC | this_WDOLC_15= ruleWDOLC | this_SBT_16= ruleSBT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3064:1: (this_DOM_0= ruleDOM | this_DOWN_1= ruleDOWN | this_DOWT_2= ruleDOWT | this_EOW_3= ruleEOW | this_All_4= ruleAll | this_GenDate_5= ruleGenDate | this_GenYear_6= ruleGenYear | this_MCD_7= ruleMCD | this_MOW_8= ruleMOW | this_NOP_9= ruleNOP | this_DOP_10= ruleDOP | this_SAEC_11= ruleSAEC | this_SOL_12= ruleSOL | this_DOL_13= ruleDOL | this_WOLC_14= ruleWOLC | this_WDOLC_15= ruleWDOLC | this_SBT_16= ruleSBT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3064:1: (this_DOM_0= ruleDOM | this_DOWN_1= ruleDOWN | this_DOWT_2= ruleDOWT | this_EOW_3= ruleEOW | this_All_4= ruleAll | this_GenDate_5= ruleGenDate | this_GenYear_6= ruleGenYear | this_MCD_7= ruleMCD | this_MOW_8= ruleMOW | this_NOP_9= ruleNOP | this_DOP_10= ruleDOP | this_SAEC_11= ruleSAEC | this_SOL_12= ruleSOL | this_DOL_13= ruleDOL | this_WOLC_14= ruleWOLC | this_WDOLC_15= ruleWDOLC | this_SBT_16= ruleSBT )
            int alt40=17;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt40=1;
                }
                break;
            case 78:
                {
                alt40=2;
                }
                break;
            case 79:
                {
                alt40=3;
                }
                break;
            case 80:
                {
                alt40=4;
                }
                break;
            case 70:
                {
                alt40=5;
                }
                break;
            case 71:
                {
                alt40=6;
                }
                break;
            case 72:
                {
                alt40=7;
                }
                break;
            case 73:
                {
                alt40=8;
                }
                break;
            case 74:
                {
                alt40=9;
                }
                break;
            case 75:
                {
                alt40=10;
                }
                break;
            case 77:
                {
                alt40=11;
                }
                break;
            case 81:
                {
                alt40=12;
                }
                break;
            case 82:
                {
                alt40=13;
                }
                break;
            case 83:
                {
                alt40=14;
                }
                break;
            case 84:
                {
                alt40=15;
                }
                break;
            case 85:
                {
                alt40=16;
                }
                break;
            case 86:
                {
                alt40=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3065:5: this_DOM_0= ruleDOM
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getDOMParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDOM_in_ruleLdpType7588);
                    this_DOM_0=ruleDOM();

                    state._fsp--;

                     
                            current = this_DOM_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3075:5: this_DOWN_1= ruleDOWN
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getDOWNParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDOWN_in_ruleLdpType7615);
                    this_DOWN_1=ruleDOWN();

                    state._fsp--;

                     
                            current = this_DOWN_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3085:5: this_DOWT_2= ruleDOWT
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getDOWTParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDOWT_in_ruleLdpType7642);
                    this_DOWT_2=ruleDOWT();

                    state._fsp--;

                     
                            current = this_DOWT_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3095:5: this_EOW_3= ruleEOW
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getEOWParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEOW_in_ruleLdpType7669);
                    this_EOW_3=ruleEOW();

                    state._fsp--;

                     
                            current = this_EOW_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3105:5: this_All_4= ruleAll
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getAllParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAll_in_ruleLdpType7696);
                    this_All_4=ruleAll();

                    state._fsp--;

                     
                            current = this_All_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3115:5: this_GenDate_5= ruleGenDate
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getGenDateParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleGenDate_in_ruleLdpType7723);
                    this_GenDate_5=ruleGenDate();

                    state._fsp--;

                     
                            current = this_GenDate_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3125:5: this_GenYear_6= ruleGenYear
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getGenYearParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleGenYear_in_ruleLdpType7750);
                    this_GenYear_6=ruleGenYear();

                    state._fsp--;

                     
                            current = this_GenYear_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3135:5: this_MCD_7= ruleMCD
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getMCDParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleMCD_in_ruleLdpType7777);
                    this_MCD_7=ruleMCD();

                    state._fsp--;

                     
                            current = this_MCD_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3145:5: this_MOW_8= ruleMOW
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getMOWParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleMOW_in_ruleLdpType7804);
                    this_MOW_8=ruleMOW();

                    state._fsp--;

                     
                            current = this_MOW_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3155:5: this_NOP_9= ruleNOP
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getNOPParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleNOP_in_ruleLdpType7831);
                    this_NOP_9=ruleNOP();

                    state._fsp--;

                     
                            current = this_NOP_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3165:5: this_DOP_10= ruleDOP
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getDOPParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleDOP_in_ruleLdpType7858);
                    this_DOP_10=ruleDOP();

                    state._fsp--;

                     
                            current = this_DOP_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3175:5: this_SAEC_11= ruleSAEC
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getSAECParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleSAEC_in_ruleLdpType7885);
                    this_SAEC_11=ruleSAEC();

                    state._fsp--;

                     
                            current = this_SAEC_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3185:5: this_SOL_12= ruleSOL
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getSOLParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleSOL_in_ruleLdpType7912);
                    this_SOL_12=ruleSOL();

                    state._fsp--;

                     
                            current = this_SOL_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3195:5: this_DOL_13= ruleDOL
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getDOLParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleDOL_in_ruleLdpType7939);
                    this_DOL_13=ruleDOL();

                    state._fsp--;

                     
                            current = this_DOL_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3205:5: this_WOLC_14= ruleWOLC
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getWOLCParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleWOLC_in_ruleLdpType7966);
                    this_WOLC_14=ruleWOLC();

                    state._fsp--;

                     
                            current = this_WOLC_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3215:5: this_WDOLC_15= ruleWDOLC
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getWDOLCParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleWDOLC_in_ruleLdpType7993);
                    this_WDOLC_15=ruleWDOLC();

                    state._fsp--;

                     
                            current = this_WDOLC_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3225:5: this_SBT_16= ruleSBT
                    {
                     
                            newCompositeNode(grammarAccess.getLdpTypeAccess().getSBTParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleSBT_in_ruleLdpType8020);
                    this_SBT_16=ruleSBT();

                    state._fsp--;

                     
                            current = this_SBT_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLdpType"


    // $ANTLR start "entryRuleAll"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3241:1: entryRuleAll returns [EObject current=null] : iv_ruleAll= ruleAll EOF ;
    public final EObject entryRuleAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAll = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3242:2: (iv_ruleAll= ruleAll EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3243:2: iv_ruleAll= ruleAll EOF
            {
             newCompositeNode(grammarAccess.getAllRule()); 
            pushFollow(FOLLOW_ruleAll_in_entryRuleAll8055);
            iv_ruleAll=ruleAll();

            state._fsp--;

             current =iv_ruleAll; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAll8065); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAll"


    // $ANTLR start "ruleAll"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3250:1: ruleAll returns [EObject current=null] : ( (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' ) ) ;
    public final EObject ruleAll() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_LiturgicalDayProperties_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3253:28: ( ( (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3254:1: ( (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3254:1: ( (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3255:1: (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3255:1: (lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3256:3: lv_dsl_Display_LiturgicalDayProperties_0_0= '@All_Liturgical_Day_Properties'
            {
            lv_dsl_Display_LiturgicalDayProperties_0_0=(Token)match(input,70,FOLLOW_70_in_ruleAll8107); 

                    newLeafNode(lv_dsl_Display_LiturgicalDayProperties_0_0, grammarAccess.getAllAccess().getDsl_Display_LiturgicalDayPropertiesAll_Liturgical_Day_PropertiesKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAllRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_LiturgicalDayProperties", true, "@All_Liturgical_Day_Properties");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAll"


    // $ANTLR start "entryRuleGenDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3277:1: entryRuleGenDate returns [EObject current=null] : iv_ruleGenDate= ruleGenDate EOF ;
    public final EObject entryRuleGenDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenDate = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3278:2: (iv_ruleGenDate= ruleGenDate EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3279:2: iv_ruleGenDate= ruleGenDate EOF
            {
             newCompositeNode(grammarAccess.getGenDateRule()); 
            pushFollow(FOLLOW_ruleGenDate_in_entryRuleGenDate8155);
            iv_ruleGenDate=ruleGenDate();

            state._fsp--;

             current =iv_ruleGenDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenDate8165); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenDate"


    // $ANTLR start "ruleGenDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3286:1: ruleGenDate returns [EObject current=null] : ( (lv_dsl_Display_Date_0_0= '@Service_Date' ) ) ;
    public final EObject ruleGenDate() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Date_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3289:28: ( ( (lv_dsl_Display_Date_0_0= '@Service_Date' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3290:1: ( (lv_dsl_Display_Date_0_0= '@Service_Date' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3290:1: ( (lv_dsl_Display_Date_0_0= '@Service_Date' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3291:1: (lv_dsl_Display_Date_0_0= '@Service_Date' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3291:1: (lv_dsl_Display_Date_0_0= '@Service_Date' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3292:3: lv_dsl_Display_Date_0_0= '@Service_Date'
            {
            lv_dsl_Display_Date_0_0=(Token)match(input,71,FOLLOW_71_in_ruleGenDate8207); 

                    newLeafNode(lv_dsl_Display_Date_0_0, grammarAccess.getGenDateAccess().getDsl_Display_DateService_DateKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenDateRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Date", true, "@Service_Date");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenDate"


    // $ANTLR start "entryRuleGenYear"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3313:1: entryRuleGenYear returns [EObject current=null] : iv_ruleGenYear= ruleGenYear EOF ;
    public final EObject entryRuleGenYear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenYear = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3314:2: (iv_ruleGenYear= ruleGenYear EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3315:2: iv_ruleGenYear= ruleGenYear EOF
            {
             newCompositeNode(grammarAccess.getGenYearRule()); 
            pushFollow(FOLLOW_ruleGenYear_in_entryRuleGenYear8255);
            iv_ruleGenYear=ruleGenYear();

            state._fsp--;

             current =iv_ruleGenYear; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenYear8265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenYear"


    // $ANTLR start "ruleGenYear"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3322:1: ruleGenYear returns [EObject current=null] : ( (lv_dsl_Display_Year_0_0= '@Service_Year' ) ) ;
    public final EObject ruleGenYear() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Year_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3325:28: ( ( (lv_dsl_Display_Year_0_0= '@Service_Year' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3326:1: ( (lv_dsl_Display_Year_0_0= '@Service_Year' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3326:1: ( (lv_dsl_Display_Year_0_0= '@Service_Year' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3327:1: (lv_dsl_Display_Year_0_0= '@Service_Year' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3327:1: (lv_dsl_Display_Year_0_0= '@Service_Year' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3328:3: lv_dsl_Display_Year_0_0= '@Service_Year'
            {
            lv_dsl_Display_Year_0_0=(Token)match(input,72,FOLLOW_72_in_ruleGenYear8307); 

                    newLeafNode(lv_dsl_Display_Year_0_0, grammarAccess.getGenYearAccess().getDsl_Display_YearService_YearKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGenYearRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Year", true, "@Service_Year");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenYear"


    // $ANTLR start "entryRuleMCD"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3349:1: entryRuleMCD returns [EObject current=null] : iv_ruleMCD= ruleMCD EOF ;
    public final EObject entryRuleMCD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCD = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3350:2: (iv_ruleMCD= ruleMCD EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3351:2: iv_ruleMCD= ruleMCD EOF
            {
             newCompositeNode(grammarAccess.getMCDRule()); 
            pushFollow(FOLLOW_ruleMCD_in_entryRuleMCD8355);
            iv_ruleMCD=ruleMCD();

            state._fsp--;

             current =iv_ruleMCD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMCD8365); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCD"


    // $ANTLR start "ruleMCD"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3358:1: ruleMCD returns [EObject current=null] : ( (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' ) ) ;
    public final EObject ruleMCD() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_MCD_value_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3361:28: ( ( (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3362:1: ( (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3362:1: ( (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3363:1: (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3363:1: (lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3364:3: lv_dsl_MCD_value_0_0= '@Day_of_Movable_Cycle'
            {
            lv_dsl_MCD_value_0_0=(Token)match(input,73,FOLLOW_73_in_ruleMCD8407); 

                    newLeafNode(lv_dsl_MCD_value_0_0, grammarAccess.getMCDAccess().getDsl_MCD_valueDay_of_Movable_CycleKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMCDRule());
            	        }
                   		setWithLastConsumed(current, "dsl_MCD_value", true, "@Day_of_Movable_Cycle");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCD"


    // $ANTLR start "entryRuleMOW"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3385:1: entryRuleMOW returns [EObject current=null] : iv_ruleMOW= ruleMOW EOF ;
    public final EObject entryRuleMOW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMOW = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3386:2: (iv_ruleMOW= ruleMOW EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3387:2: iv_ruleMOW= ruleMOW EOF
            {
             newCompositeNode(grammarAccess.getMOWRule()); 
            pushFollow(FOLLOW_ruleMOW_in_entryRuleMOW8455);
            iv_ruleMOW=ruleMOW();

            state._fsp--;

             current =iv_ruleMOW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMOW8465); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMOW"


    // $ANTLR start "ruleMOW"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3394:1: ruleMOW returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' ) ) ;
    public final EObject ruleMOW() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3397:28: ( ( (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3398:1: ( (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3398:1: ( (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3399:1: (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3399:1: (lv_dsl_Display_Mode_0_0= '@Mode_of_Week' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3400:3: lv_dsl_Display_Mode_0_0= '@Mode_of_Week'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,74,FOLLOW_74_in_ruleMOW8507); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getMOWAccess().getDsl_Display_ModeMode_of_WeekKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMOWRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Mode_of_Week");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMOW"


    // $ANTLR start "entryRuleNOP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3421:1: entryRuleNOP returns [EObject current=null] : iv_ruleNOP= ruleNOP EOF ;
    public final EObject entryRuleNOP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNOP = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3422:2: (iv_ruleNOP= ruleNOP EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3423:2: iv_ruleNOP= ruleNOP EOF
            {
             newCompositeNode(grammarAccess.getNOPRule()); 
            pushFollow(FOLLOW_ruleNOP_in_entryRuleNOP8555);
            iv_ruleNOP=ruleNOP();

            state._fsp--;

             current =iv_ruleNOP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNOP8565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNOP"


    // $ANTLR start "ruleNOP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3430:1: ruleNOP returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Name_of_Period' ) ) ;
    public final EObject ruleNOP() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3433:28: ( ( (lv_dsl_Display_Mode_0_0= '@Name_of_Period' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3434:1: ( (lv_dsl_Display_Mode_0_0= '@Name_of_Period' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3434:1: ( (lv_dsl_Display_Mode_0_0= '@Name_of_Period' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3435:1: (lv_dsl_Display_Mode_0_0= '@Name_of_Period' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3435:1: (lv_dsl_Display_Mode_0_0= '@Name_of_Period' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3436:3: lv_dsl_Display_Mode_0_0= '@Name_of_Period'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,75,FOLLOW_75_in_ruleNOP8607); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getNOPAccess().getDsl_Display_ModeName_of_PeriodKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNOPRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Name_of_Period");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNOP"


    // $ANTLR start "entryRuleDOM"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3457:1: entryRuleDOM returns [EObject current=null] : iv_ruleDOM= ruleDOM EOF ;
    public final EObject entryRuleDOM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOM = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3458:2: (iv_ruleDOM= ruleDOM EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3459:2: iv_ruleDOM= ruleDOM EOF
            {
             newCompositeNode(grammarAccess.getDOMRule()); 
            pushFollow(FOLLOW_ruleDOM_in_entryRuleDOM8655);
            iv_ruleDOM=ruleDOM();

            state._fsp--;

             current =iv_ruleDOM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOM8665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOM"


    // $ANTLR start "ruleDOM"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3466:1: ruleDOM returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Day_of_Month' ) ) ;
    public final EObject ruleDOM() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3469:28: ( ( (lv_dsl_Display_Mode_0_0= '@Day_of_Month' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3470:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Month' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3470:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Month' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3471:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Month' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3471:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Month' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3472:3: lv_dsl_Display_Mode_0_0= '@Day_of_Month'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,76,FOLLOW_76_in_ruleDOM8707); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getDOMAccess().getDsl_Display_ModeDay_of_MonthKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDOMRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Day_of_Month");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOM"


    // $ANTLR start "entryRuleDOP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3493:1: entryRuleDOP returns [EObject current=null] : iv_ruleDOP= ruleDOP EOF ;
    public final EObject entryRuleDOP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOP = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3494:2: (iv_ruleDOP= ruleDOP EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3495:2: iv_ruleDOP= ruleDOP EOF
            {
             newCompositeNode(grammarAccess.getDOPRule()); 
            pushFollow(FOLLOW_ruleDOP_in_entryRuleDOP8755);
            iv_ruleDOP=ruleDOP();

            state._fsp--;

             current =iv_ruleDOP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOP8765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOP"


    // $ANTLR start "ruleDOP"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3502:1: ruleDOP returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Day_of_Period' ) ) ;
    public final EObject ruleDOP() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3505:28: ( ( (lv_dsl_Display_Mode_0_0= '@Day_of_Period' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3506:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Period' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3506:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Period' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3507:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Period' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3507:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Period' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3508:3: lv_dsl_Display_Mode_0_0= '@Day_of_Period'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,77,FOLLOW_77_in_ruleDOP8807); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getDOPAccess().getDsl_Display_ModeDay_of_PeriodKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDOPRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Day_of_Period");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOP"


    // $ANTLR start "entryRuleDOWN"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3529:1: entryRuleDOWN returns [EObject current=null] : iv_ruleDOWN= ruleDOWN EOF ;
    public final EObject entryRuleDOWN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOWN = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3530:2: (iv_ruleDOWN= ruleDOWN EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3531:2: iv_ruleDOWN= ruleDOWN EOF
            {
             newCompositeNode(grammarAccess.getDOWNRule()); 
            pushFollow(FOLLOW_ruleDOWN_in_entryRuleDOWN8855);
            iv_ruleDOWN=ruleDOWN();

            state._fsp--;

             current =iv_ruleDOWN; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOWN8865); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOWN"


    // $ANTLR start "ruleDOWN"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3538:1: ruleDOWN returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' ) ) ;
    public final EObject ruleDOWN() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3541:28: ( ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3542:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3542:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3543:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3543:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3544:3: lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Number'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,78,FOLLOW_78_in_ruleDOWN8907); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getDOWNAccess().getDsl_Display_ModeDay_of_Week_As_NumberKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDOWNRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Day_of_Week_As_Number");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOWN"


    // $ANTLR start "entryRuleDOWT"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3565:1: entryRuleDOWT returns [EObject current=null] : iv_ruleDOWT= ruleDOWT EOF ;
    public final EObject entryRuleDOWT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOWT = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3566:2: (iv_ruleDOWT= ruleDOWT EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3567:2: iv_ruleDOWT= ruleDOWT EOF
            {
             newCompositeNode(grammarAccess.getDOWTRule()); 
            pushFollow(FOLLOW_ruleDOWT_in_entryRuleDOWT8955);
            iv_ruleDOWT=ruleDOWT();

            state._fsp--;

             current =iv_ruleDOWT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOWT8965); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOWT"


    // $ANTLR start "ruleDOWT"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3574:1: ruleDOWT returns [EObject current=null] : ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' ) ) ;
    public final EObject ruleDOWT() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Mode_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3577:28: ( ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3578:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3578:1: ( (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3579:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3579:1: (lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3580:3: lv_dsl_Display_Mode_0_0= '@Day_of_Week_As_Text'
            {
            lv_dsl_Display_Mode_0_0=(Token)match(input,79,FOLLOW_79_in_ruleDOWT9007); 

                    newLeafNode(lv_dsl_Display_Mode_0_0, grammarAccess.getDOWTAccess().getDsl_Display_ModeDay_of_Week_As_TextKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDOWTRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Mode", true, "@Day_of_Week_As_Text");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOWT"


    // $ANTLR start "entryRuleEOW"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3601:1: entryRuleEOW returns [EObject current=null] : iv_ruleEOW= ruleEOW EOF ;
    public final EObject entryRuleEOW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOW = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3602:2: (iv_ruleEOW= ruleEOW EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3603:2: iv_ruleEOW= ruleEOW EOF
            {
             newCompositeNode(grammarAccess.getEOWRule()); 
            pushFollow(FOLLOW_ruleEOW_in_entryRuleEOW9055);
            iv_ruleEOW=ruleEOW();

            state._fsp--;

             current =iv_ruleEOW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEOW9065); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOW"


    // $ANTLR start "ruleEOW"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3610:1: ruleEOW returns [EObject current=null] : ( (lv_dsl_Display_Eothinon_0_0= '@Eothinon' ) ) ;
    public final EObject ruleEOW() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_Eothinon_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3613:28: ( ( (lv_dsl_Display_Eothinon_0_0= '@Eothinon' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3614:1: ( (lv_dsl_Display_Eothinon_0_0= '@Eothinon' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3614:1: ( (lv_dsl_Display_Eothinon_0_0= '@Eothinon' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3615:1: (lv_dsl_Display_Eothinon_0_0= '@Eothinon' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3615:1: (lv_dsl_Display_Eothinon_0_0= '@Eothinon' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3616:3: lv_dsl_Display_Eothinon_0_0= '@Eothinon'
            {
            lv_dsl_Display_Eothinon_0_0=(Token)match(input,80,FOLLOW_80_in_ruleEOW9107); 

                    newLeafNode(lv_dsl_Display_Eothinon_0_0, grammarAccess.getEOWAccess().getDsl_Display_EothinonEothinonKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEOWRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_Eothinon", true, "@Eothinon");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOW"


    // $ANTLR start "entryRuleSAEC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3637:1: entryRuleSAEC returns [EObject current=null] : iv_ruleSAEC= ruleSAEC EOF ;
    public final EObject entryRuleSAEC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSAEC = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3638:2: (iv_ruleSAEC= ruleSAEC EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3639:2: iv_ruleSAEC= ruleSAEC EOF
            {
             newCompositeNode(grammarAccess.getSAECRule()); 
            pushFollow(FOLLOW_ruleSAEC_in_entryRuleSAEC9155);
            iv_ruleSAEC=ruleSAEC();

            state._fsp--;

             current =iv_ruleSAEC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSAEC9165); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSAEC"


    // $ANTLR start "ruleSAEC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3646:1: ruleSAEC returns [EObject current=null] : ( (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' ) ) ;
    public final EObject ruleSAEC() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_SundayAfterElevationCross_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3649:28: ( ( (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3650:1: ( (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3650:1: ( (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3651:1: (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3651:1: (lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3652:3: lv_dsl_Display_SundayAfterElevationCross_0_0= '@Sunday_After_Elevation_Cross_Date'
            {
            lv_dsl_Display_SundayAfterElevationCross_0_0=(Token)match(input,81,FOLLOW_81_in_ruleSAEC9207); 

                    newLeafNode(lv_dsl_Display_SundayAfterElevationCross_0_0, grammarAccess.getSAECAccess().getDsl_Display_SundayAfterElevationCrossSunday_After_Elevation_Cross_DateKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSAECRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_SundayAfterElevationCross", true, "@Sunday_After_Elevation_Cross_Date");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSAEC"


    // $ANTLR start "entryRuleSOL"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3673:1: entryRuleSOL returns [EObject current=null] : iv_ruleSOL= ruleSOL EOF ;
    public final EObject entryRuleSOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSOL = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3674:2: (iv_ruleSOL= ruleSOL EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3675:2: iv_ruleSOL= ruleSOL EOF
            {
             newCompositeNode(grammarAccess.getSOLRule()); 
            pushFollow(FOLLOW_ruleSOL_in_entryRuleSOL9255);
            iv_ruleSOL=ruleSOL();

            state._fsp--;

             current =iv_ruleSOL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSOL9265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSOL"


    // $ANTLR start "ruleSOL"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3682:1: ruleSOL returns [EObject current=null] : ( (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' ) ) ;
    public final EObject ruleSOL() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_StartLukan_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3685:28: ( ( (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3686:1: ( (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3686:1: ( (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3687:1: (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3687:1: (lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3688:3: lv_dsl_Display_StartLukan_0_0= '@Lukan_Cycle_Start_Date'
            {
            lv_dsl_Display_StartLukan_0_0=(Token)match(input,82,FOLLOW_82_in_ruleSOL9307); 

                    newLeafNode(lv_dsl_Display_StartLukan_0_0, grammarAccess.getSOLAccess().getDsl_Display_StartLukanLukan_Cycle_Start_DateKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSOLRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_StartLukan", true, "@Lukan_Cycle_Start_Date");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSOL"


    // $ANTLR start "entryRuleDOL"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3709:1: entryRuleDOL returns [EObject current=null] : iv_ruleDOL= ruleDOL EOF ;
    public final EObject entryRuleDOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOL = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3710:2: (iv_ruleDOL= ruleDOL EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3711:2: iv_ruleDOL= ruleDOL EOF
            {
             newCompositeNode(grammarAccess.getDOLRule()); 
            pushFollow(FOLLOW_ruleDOL_in_entryRuleDOL9355);
            iv_ruleDOL=ruleDOL();

            state._fsp--;

             current =iv_ruleDOL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOL9365); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOL"


    // $ANTLR start "ruleDOL"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3718:1: ruleDOL returns [EObject current=null] : ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' ) ) ;
    public final EObject ruleDOL() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_DayLukan_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3721:28: ( ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3722:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3722:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3723:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3723:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3724:3: lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Elapsed_Days'
            {
            lv_dsl_Display_DayLukan_0_0=(Token)match(input,83,FOLLOW_83_in_ruleDOL9407); 

                    newLeafNode(lv_dsl_Display_DayLukan_0_0, grammarAccess.getDOLAccess().getDsl_Display_DayLukanLukan_Cycle_Elapsed_DaysKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDOLRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_DayLukan", true, "@Lukan_Cycle_Elapsed_Days");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOL"


    // $ANTLR start "entryRuleWOLC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3745:1: entryRuleWOLC returns [EObject current=null] : iv_ruleWOLC= ruleWOLC EOF ;
    public final EObject entryRuleWOLC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWOLC = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3746:2: (iv_ruleWOLC= ruleWOLC EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3747:2: iv_ruleWOLC= ruleWOLC EOF
            {
             newCompositeNode(grammarAccess.getWOLCRule()); 
            pushFollow(FOLLOW_ruleWOLC_in_entryRuleWOLC9455);
            iv_ruleWOLC=ruleWOLC();

            state._fsp--;

             current =iv_ruleWOLC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWOLC9465); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWOLC"


    // $ANTLR start "ruleWOLC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3754:1: ruleWOLC returns [EObject current=null] : ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' ) ) ;
    public final EObject ruleWOLC() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_DayLukan_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3757:28: ( ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3758:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3758:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3759:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3759:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3760:3: lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week'
            {
            lv_dsl_Display_DayLukan_0_0=(Token)match(input,84,FOLLOW_84_in_ruleWOLC9507); 

                    newLeafNode(lv_dsl_Display_DayLukan_0_0, grammarAccess.getWOLCAccess().getDsl_Display_DayLukanLukan_Cycle_WeekKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWOLCRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_DayLukan", true, "@Lukan_Cycle_Week");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWOLC"


    // $ANTLR start "entryRuleWDOLC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3781:1: entryRuleWDOLC returns [EObject current=null] : iv_ruleWDOLC= ruleWDOLC EOF ;
    public final EObject entryRuleWDOLC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWDOLC = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3782:2: (iv_ruleWDOLC= ruleWDOLC EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3783:2: iv_ruleWDOLC= ruleWDOLC EOF
            {
             newCompositeNode(grammarAccess.getWDOLCRule()); 
            pushFollow(FOLLOW_ruleWDOLC_in_entryRuleWDOLC9555);
            iv_ruleWDOLC=ruleWDOLC();

            state._fsp--;

             current =iv_ruleWDOLC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWDOLC9565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWDOLC"


    // $ANTLR start "ruleWDOLC"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3790:1: ruleWDOLC returns [EObject current=null] : ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' ) ) ;
    public final EObject ruleWDOLC() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_DayLukan_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3793:28: ( ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3794:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3794:1: ( (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3795:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3795:1: (lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3796:3: lv_dsl_Display_DayLukan_0_0= '@Lukan_Cycle_Week_Day'
            {
            lv_dsl_Display_DayLukan_0_0=(Token)match(input,85,FOLLOW_85_in_ruleWDOLC9607); 

                    newLeafNode(lv_dsl_Display_DayLukan_0_0, grammarAccess.getWDOLCAccess().getDsl_Display_DayLukanLukan_Cycle_Week_DayKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWDOLCRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_DayLukan", true, "@Lukan_Cycle_Week_Day");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWDOLC"


    // $ANTLR start "entryRuleSBT"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3817:1: entryRuleSBT returns [EObject current=null] : iv_ruleSBT= ruleSBT EOF ;
    public final EObject entryRuleSBT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSBT = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3818:2: (iv_ruleSBT= ruleSBT EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3819:2: iv_ruleSBT= ruleSBT EOF
            {
             newCompositeNode(grammarAccess.getSBTRule()); 
            pushFollow(FOLLOW_ruleSBT_in_entryRuleSBT9655);
            iv_ruleSBT=ruleSBT();

            state._fsp--;

             current =iv_ruleSBT; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSBT9665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSBT"


    // $ANTLR start "ruleSBT"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3826:1: ruleSBT returns [EObject current=null] : ( (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' ) ) ;
    public final EObject ruleSBT() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_Display_SundaysBeforeTriodion_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3829:28: ( ( (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3830:1: ( (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3830:1: ( (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3831:1: (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3831:1: (lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3832:3: lv_dsl_Display_SundaysBeforeTriodion_0_0= '@Sundays_Before_Triodion'
            {
            lv_dsl_Display_SundaysBeforeTriodion_0_0=(Token)match(input,86,FOLLOW_86_in_ruleSBT9707); 

                    newLeafNode(lv_dsl_Display_SundaysBeforeTriodion_0_0, grammarAccess.getSBTAccess().getDsl_Display_SundaysBeforeTriodionSundays_Before_TriodionKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSBTRule());
            	        }
                   		setWithLastConsumed(current, "dsl_Display_SundaysBeforeTriodion", true, "@Sundays_Before_Triodion");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSBT"


    // $ANTLR start "entryRuleTemplateFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3853:1: entryRuleTemplateFragment returns [EObject current=null] : iv_ruleTemplateFragment= ruleTemplateFragment EOF ;
    public final EObject entryRuleTemplateFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateFragment = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3854:2: (iv_ruleTemplateFragment= ruleTemplateFragment EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3855:2: iv_ruleTemplateFragment= ruleTemplateFragment EOF
            {
             newCompositeNode(grammarAccess.getTemplateFragmentRule()); 
            pushFollow(FOLLOW_ruleTemplateFragment_in_entryRuleTemplateFragment9755);
            iv_ruleTemplateFragment=ruleTemplateFragment();

            state._fsp--;

             current =iv_ruleTemplateFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateFragment9765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateFragment"


    // $ANTLR start "ruleTemplateFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3862:1: ruleTemplateFragment returns [EObject current=null] : (otherlv_0= 'Insert_template' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' ) ;
    public final EObject ruleTemplateFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3865:28: ( (otherlv_0= 'Insert_template' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3866:1: (otherlv_0= 'Insert_template' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3866:1: (otherlv_0= 'Insert_template' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3866:3: otherlv_0= 'Insert_template' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_87_in_ruleTemplateFragment9802); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateFragmentAccess().getInsert_templateKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3870:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3871:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3871:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3872:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTemplateFragmentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTemplateFragmentAccess().getNameAtemModelCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateFragment9825);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,88,FOLLOW_88_in_ruleTemplateFragment9837); 

                	newLeafNode(otherlv_2, grammarAccess.getTemplateFragmentAccess().getEndInsertKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateFragment"


    // $ANTLR start "entryRuleSectionFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3899:1: entryRuleSectionFragment returns [EObject current=null] : iv_ruleSectionFragment= ruleSectionFragment EOF ;
    public final EObject entryRuleSectionFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionFragment = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3900:2: (iv_ruleSectionFragment= ruleSectionFragment EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3901:2: iv_ruleSectionFragment= ruleSectionFragment EOF
            {
             newCompositeNode(grammarAccess.getSectionFragmentRule()); 
            pushFollow(FOLLOW_ruleSectionFragment_in_entryRuleSectionFragment9875);
            iv_ruleSectionFragment=ruleSectionFragment();

            state._fsp--;

             current =iv_ruleSectionFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSectionFragment9885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionFragment"


    // $ANTLR start "ruleSectionFragment"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3908:1: ruleSectionFragment returns [EObject current=null] : (otherlv_0= 'Insert_section' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' ) ;
    public final EObject ruleSectionFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3911:28: ( (otherlv_0= 'Insert_section' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3912:1: (otherlv_0= 'Insert_section' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3912:1: (otherlv_0= 'Insert_section' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3912:3: otherlv_0= 'Insert_section' ( ( ruleQualifiedName ) ) otherlv_2= 'End-Insert'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleSectionFragment9922); 

                	newLeafNode(otherlv_0, grammarAccess.getSectionFragmentAccess().getInsert_sectionKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3916:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3917:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3917:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3918:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSectionFragmentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getSectionFragmentAccess().getNameSectionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSectionFragment9945);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,88,FOLLOW_88_in_ruleSectionFragment9957); 

                	newLeafNode(otherlv_2, grammarAccess.getSectionFragmentAccess().getEndInsertKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionFragment"


    // $ANTLR start "entryRuleBreak"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3943:1: entryRuleBreak returns [EObject current=null] : iv_ruleBreak= ruleBreak EOF ;
    public final EObject entryRuleBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreak = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3944:2: (iv_ruleBreak= ruleBreak EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3945:2: iv_ruleBreak= ruleBreak EOF
            {
             newCompositeNode(grammarAccess.getBreakRule()); 
            pushFollow(FOLLOW_ruleBreak_in_entryRuleBreak9993);
            iv_ruleBreak=ruleBreak();

            state._fsp--;

             current =iv_ruleBreak; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreak10003); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3952:1: ruleBreak returns [EObject current=null] : (otherlv_0= 'Break' ( (lv_dsl_break_type_1_0= ruleBreakType ) ) otherlv_2= 'End_Break' ) ;
    public final EObject ruleBreak() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_dsl_break_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3955:28: ( (otherlv_0= 'Break' ( (lv_dsl_break_type_1_0= ruleBreakType ) ) otherlv_2= 'End_Break' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3956:1: (otherlv_0= 'Break' ( (lv_dsl_break_type_1_0= ruleBreakType ) ) otherlv_2= 'End_Break' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3956:1: (otherlv_0= 'Break' ( (lv_dsl_break_type_1_0= ruleBreakType ) ) otherlv_2= 'End_Break' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3956:3: otherlv_0= 'Break' ( (lv_dsl_break_type_1_0= ruleBreakType ) ) otherlv_2= 'End_Break'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_90_in_ruleBreak10040); 

                	newLeafNode(otherlv_0, grammarAccess.getBreakAccess().getBreakKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3960:1: ( (lv_dsl_break_type_1_0= ruleBreakType ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3961:1: (lv_dsl_break_type_1_0= ruleBreakType )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3961:1: (lv_dsl_break_type_1_0= ruleBreakType )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3962:3: lv_dsl_break_type_1_0= ruleBreakType
            {
             
            	        newCompositeNode(grammarAccess.getBreakAccess().getDsl_break_typeBreakTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBreakType_in_ruleBreak10061);
            lv_dsl_break_type_1_0=ruleBreakType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBreakRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_break_type",
                    		lv_dsl_break_type_1_0, 
                    		"BreakType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,91,FOLLOW_91_in_ruleBreak10073); 

                	newLeafNode(otherlv_2, grammarAccess.getBreakAccess().getEnd_BreakKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRulePageNumber"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3990:1: entryRulePageNumber returns [EObject current=null] : iv_rulePageNumber= rulePageNumber EOF ;
    public final EObject entryRulePageNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageNumber = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3991:2: (iv_rulePageNumber= rulePageNumber EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3992:2: iv_rulePageNumber= rulePageNumber EOF
            {
             newCompositeNode(grammarAccess.getPageNumberRule()); 
            pushFollow(FOLLOW_rulePageNumber_in_entryRulePageNumber10109);
            iv_rulePageNumber=rulePageNumber();

            state._fsp--;

             current =iv_rulePageNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePageNumber10119); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePageNumber"


    // $ANTLR start "rulePageNumber"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:3999:1: rulePageNumber returns [EObject current=null] : (otherlv_0= 'Set_Page_Number' ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) ) otherlv_2= 'End_Set_Page_Number' ) ;
    public final EObject rulePageNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_PageNumber_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4002:28: ( (otherlv_0= 'Set_Page_Number' ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) ) otherlv_2= 'End_Set_Page_Number' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4003:1: (otherlv_0= 'Set_Page_Number' ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) ) otherlv_2= 'End_Set_Page_Number' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4003:1: (otherlv_0= 'Set_Page_Number' ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) ) otherlv_2= 'End_Set_Page_Number' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4003:3: otherlv_0= 'Set_Page_Number' ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) ) otherlv_2= 'End_Set_Page_Number'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_92_in_rulePageNumber10156); 

                	newLeafNode(otherlv_0, grammarAccess.getPageNumberAccess().getSet_Page_NumberKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4007:1: ( (lv_dsl_PageNumber_value_1_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4008:1: (lv_dsl_PageNumber_value_1_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4008:1: (lv_dsl_PageNumber_value_1_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4009:3: lv_dsl_PageNumber_value_1_0= RULE_INT
            {
            lv_dsl_PageNumber_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePageNumber10173); 

            			newLeafNode(lv_dsl_PageNumber_value_1_0, grammarAccess.getPageNumberAccess().getDsl_PageNumber_valueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageNumberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_PageNumber_value",
                    		lv_dsl_PageNumber_value_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,93,FOLLOW_93_in_rulePageNumber10190); 

                	newLeafNode(otherlv_2, grammarAccess.getPageNumberAccess().getEnd_Set_Page_NumberKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePageNumber"


    // $ANTLR start "entryRulePassThroughHtml"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4037:1: entryRulePassThroughHtml returns [EObject current=null] : iv_rulePassThroughHtml= rulePassThroughHtml EOF ;
    public final EObject entryRulePassThroughHtml() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassThroughHtml = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4038:2: (iv_rulePassThroughHtml= rulePassThroughHtml EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4039:2: iv_rulePassThroughHtml= rulePassThroughHtml EOF
            {
             newCompositeNode(grammarAccess.getPassThroughHtmlRule()); 
            pushFollow(FOLLOW_rulePassThroughHtml_in_entryRulePassThroughHtml10226);
            iv_rulePassThroughHtml=rulePassThroughHtml();

            state._fsp--;

             current =iv_rulePassThroughHtml; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePassThroughHtml10236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePassThroughHtml"


    // $ANTLR start "rulePassThroughHtml"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4046:1: rulePassThroughHtml returns [EObject current=null] : (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Html' ) ;
    public final EObject rulePassThroughHtml() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_Passthrough_html_text_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4049:28: ( (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Html' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4050:1: (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Html' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4050:1: (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Html' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4050:3: otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Html'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_rulePassThroughHtml10273); 

                	newLeafNode(otherlv_0, grammarAccess.getPassThroughHtmlAccess().getPassthroughHtmlKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4054:1: ( (lv_dsl_Passthrough_html_text_1_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4055:1: (lv_dsl_Passthrough_html_text_1_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4055:1: (lv_dsl_Passthrough_html_text_1_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4056:3: lv_dsl_Passthrough_html_text_1_0= RULE_STRING
            {
            lv_dsl_Passthrough_html_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePassThroughHtml10290); 

            			newLeafNode(lv_dsl_Passthrough_html_text_1_0, grammarAccess.getPassThroughHtmlAccess().getDsl_Passthrough_html_textSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPassThroughHtmlRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Passthrough_html_text",
                    		lv_dsl_Passthrough_html_text_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,95,FOLLOW_95_in_rulePassThroughHtml10307); 

                	newLeafNode(otherlv_2, grammarAccess.getPassThroughHtmlAccess().getENDPassthroughHtmlKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePassThroughHtml"


    // $ANTLR start "entryRulePassThroughPdf"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4084:1: entryRulePassThroughPdf returns [EObject current=null] : iv_rulePassThroughPdf= rulePassThroughPdf EOF ;
    public final EObject entryRulePassThroughPdf() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassThroughPdf = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4085:2: (iv_rulePassThroughPdf= rulePassThroughPdf EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4086:2: iv_rulePassThroughPdf= rulePassThroughPdf EOF
            {
             newCompositeNode(grammarAccess.getPassThroughPdfRule()); 
            pushFollow(FOLLOW_rulePassThroughPdf_in_entryRulePassThroughPdf10343);
            iv_rulePassThroughPdf=rulePassThroughPdf();

            state._fsp--;

             current =iv_rulePassThroughPdf; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePassThroughPdf10353); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePassThroughPdf"


    // $ANTLR start "rulePassThroughPdf"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4093:1: rulePassThroughPdf returns [EObject current=null] : (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Pdf' ) ;
    public final EObject rulePassThroughPdf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dsl_Passthrough_pdf_text_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4096:28: ( (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Pdf' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4097:1: (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Pdf' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4097:1: (otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Pdf' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4097:3: otherlv_0= 'Passthrough-Html' ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) ) otherlv_2= 'END-Passthrough-Pdf'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_94_in_rulePassThroughPdf10390); 

                	newLeafNode(otherlv_0, grammarAccess.getPassThroughPdfAccess().getPassthroughHtmlKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4101:1: ( (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4102:1: (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4102:1: (lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4103:3: lv_dsl_Passthrough_pdf_text_1_0= RULE_STRING
            {
            lv_dsl_Passthrough_pdf_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePassThroughPdf10407); 

            			newLeafNode(lv_dsl_Passthrough_pdf_text_1_0, grammarAccess.getPassThroughPdfAccess().getDsl_Passthrough_pdf_textSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPassThroughPdfRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Passthrough_pdf_text",
                    		lv_dsl_Passthrough_pdf_text_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,96,FOLLOW_96_in_rulePassThroughPdf10424); 

                	newLeafNode(otherlv_2, grammarAccess.getPassThroughPdfAccess().getENDPassthroughPdfKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePassThroughPdf"


    // $ANTLR start "entryRuleTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4131:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4132:2: (iv_ruleTitle= ruleTitle EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4133:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_ruleTitle_in_entryRuleTitle10460);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitle10470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4140:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Title' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dsl_Elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4143:28: ( (otherlv_0= 'Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Title' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4144:1: (otherlv_0= 'Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Title' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4144:1: (otherlv_0= 'Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Title' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4144:3: otherlv_0= 'Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Title'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_ruleTitle10507); 

                	newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4148:1: (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==68) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4148:3: otherlv_1= 'role' ( ( ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleTitle10520); 

                        	newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getRoleKeyword_1_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4152:1: ( ( ruleQualifiedName ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4153:1: ( ruleQualifiedName )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4153:1: ( ruleQualifiedName )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4154:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTitleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTitleAccess().getDsl_Title_RoleDefinitionCrossReference_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTitle10543);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4167:4: ( (lv_dsl_Elements_3_0= ruleElementType ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==49||LA42_0==51||(LA42_0>=54 && LA42_0<=55)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4168:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4168:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4169:3: lv_dsl_Elements_3_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTitleAccess().getDsl_ElementsElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleTitle10566);
            	    lv_dsl_Elements_3_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTitleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_3_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,98,FOLLOW_98_in_ruleTitle10579); 

                	newLeafNode(otherlv_4, grammarAccess.getTitleAccess().getEndTitleKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleSubTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4197:1: entryRuleSubTitle returns [EObject current=null] : iv_ruleSubTitle= ruleSubTitle EOF ;
    public final EObject entryRuleSubTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubTitle = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4198:2: (iv_ruleSubTitle= ruleSubTitle EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4199:2: iv_ruleSubTitle= ruleSubTitle EOF
            {
             newCompositeNode(grammarAccess.getSubTitleRule()); 
            pushFollow(FOLLOW_ruleSubTitle_in_entryRuleSubTitle10615);
            iv_ruleSubTitle=ruleSubTitle();

            state._fsp--;

             current =iv_ruleSubTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubTitle10625); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubTitle"


    // $ANTLR start "ruleSubTitle"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4206:1: ruleSubTitle returns [EObject current=null] : (otherlv_0= 'Sub-Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Sub-Title' ) ;
    public final EObject ruleSubTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dsl_Elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4209:28: ( (otherlv_0= 'Sub-Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Sub-Title' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4210:1: (otherlv_0= 'Sub-Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Sub-Title' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4210:1: (otherlv_0= 'Sub-Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Sub-Title' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4210:3: otherlv_0= 'Sub-Title' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Sub-Title'
            {
            otherlv_0=(Token)match(input,99,FOLLOW_99_in_ruleSubTitle10662); 

                	newLeafNode(otherlv_0, grammarAccess.getSubTitleAccess().getSubTitleKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4214:1: (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==68) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4214:3: otherlv_1= 'role' ( ( ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleSubTitle10675); 

                        	newLeafNode(otherlv_1, grammarAccess.getSubTitleAccess().getRoleKeyword_1_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4218:1: ( ( ruleQualifiedName ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4219:1: ( ruleQualifiedName )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4219:1: ( ruleQualifiedName )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4220:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubTitleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSubTitleAccess().getDsl_SubTitle_RoleDefinitionCrossReference_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubTitle10698);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4233:4: ( (lv_dsl_Elements_3_0= ruleElementType ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==49||LA44_0==51||(LA44_0>=54 && LA44_0<=55)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4234:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4234:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4235:3: lv_dsl_Elements_3_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubTitleAccess().getDsl_ElementsElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleSubTitle10721);
            	    lv_dsl_Elements_3_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubTitleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_3_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,100,FOLLOW_100_in_ruleSubTitle10734); 

                	newLeafNode(otherlv_4, grammarAccess.getSubTitleAccess().getEndSubTitleKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubTitle"


    // $ANTLR start "entryRuleParagraph"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4263:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4264:2: (iv_ruleParagraph= ruleParagraph EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4265:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_ruleParagraph_in_entryRuleParagraph10770);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParagraph10780); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4272:1: ruleParagraph returns [EObject current=null] : (otherlv_0= 'Para' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Para' ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dsl_Elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4275:28: ( (otherlv_0= 'Para' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Para' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4276:1: (otherlv_0= 'Para' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Para' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4276:1: (otherlv_0= 'Para' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Para' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4276:3: otherlv_0= 'Para' (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )? ( (lv_dsl_Elements_3_0= ruleElementType ) )* otherlv_4= 'End-Para'
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleParagraph10817); 

                	newLeafNode(otherlv_0, grammarAccess.getParagraphAccess().getParaKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4280:1: (otherlv_1= 'role' ( ( ruleQualifiedName ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==68) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4280:3: otherlv_1= 'role' ( ( ruleQualifiedName ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleParagraph10830); 

                        	newLeafNode(otherlv_1, grammarAccess.getParagraphAccess().getRoleKeyword_1_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4284:1: ( ( ruleQualifiedName ) )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4285:1: ( ruleQualifiedName )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4285:1: ( ruleQualifiedName )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4286:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getParagraphRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getParagraphAccess().getDsl_Para_RoleDefinitionCrossReference_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleParagraph10853);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4299:4: ( (lv_dsl_Elements_3_0= ruleElementType ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==49||LA46_0==51||(LA46_0>=54 && LA46_0<=55)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4300:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4300:1: (lv_dsl_Elements_3_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4301:3: lv_dsl_Elements_3_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParagraphAccess().getDsl_ElementsElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleParagraph10876);
            	    lv_dsl_Elements_3_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParagraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_3_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,102,FOLLOW_102_in_ruleParagraph10889); 

                	newLeafNode(otherlv_4, grammarAccess.getParagraphAccess().getEndParaKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleBlock"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4329:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4330:2: (iv_ruleBlock= ruleBlock EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4331:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock10925);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock10935); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4338:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'bTag' ( ( ruleQualifiedName ) ) ( (lv_dsl_Elements_2_0= ruleElementType ) )* otherlv_3= 'End-bTag' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_Elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4341:28: ( (otherlv_0= 'bTag' ( ( ruleQualifiedName ) ) ( (lv_dsl_Elements_2_0= ruleElementType ) )* otherlv_3= 'End-bTag' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4342:1: (otherlv_0= 'bTag' ( ( ruleQualifiedName ) ) ( (lv_dsl_Elements_2_0= ruleElementType ) )* otherlv_3= 'End-bTag' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4342:1: (otherlv_0= 'bTag' ( ( ruleQualifiedName ) ) ( (lv_dsl_Elements_2_0= ruleElementType ) )* otherlv_3= 'End-bTag' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4342:3: otherlv_0= 'bTag' ( ( ruleQualifiedName ) ) ( (lv_dsl_Elements_2_0= ruleElementType ) )* otherlv_3= 'End-bTag'
            {
            otherlv_0=(Token)match(input,103,FOLLOW_103_in_ruleBlock10972); 

                	newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBTagKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4346:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4347:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4347:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4348:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBlockRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBlockAccess().getDsl_Block_RoleDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBlock10995);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4361:2: ( (lv_dsl_Elements_2_0= ruleElementType ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==49||LA47_0==51||(LA47_0>=54 && LA47_0<=55)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4362:1: (lv_dsl_Elements_2_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4362:1: (lv_dsl_Elements_2_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4363:3: lv_dsl_Elements_2_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getDsl_ElementsElementTypeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleBlock11016);
            	    lv_dsl_Elements_2_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_2_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_3=(Token)match(input,104,FOLLOW_104_in_ruleBlock11029); 

                	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getEndBTagKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleHymn"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4391:1: entryRuleHymn returns [EObject current=null] : iv_ruleHymn= ruleHymn EOF ;
    public final EObject entryRuleHymn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHymn = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4392:2: (iv_ruleHymn= ruleHymn EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4393:2: iv_ruleHymn= ruleHymn EOF
            {
             newCompositeNode(grammarAccess.getHymnRule()); 
            pushFollow(FOLLOW_ruleHymn_in_entryRuleHymn11065);
            iv_ruleHymn=ruleHymn();

            state._fsp--;

             current =iv_ruleHymn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHymn11075); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHymn"


    // $ANTLR start "ruleHymn"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4400:1: ruleHymn returns [EObject current=null] : (otherlv_0= 'Hymn' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Hymn' ) ;
    public final EObject ruleHymn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4403:28: ( (otherlv_0= 'Hymn' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Hymn' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4404:1: (otherlv_0= 'Hymn' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Hymn' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4404:1: (otherlv_0= 'Hymn' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Hymn' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4404:3: otherlv_0= 'Hymn' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Hymn'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_ruleHymn11112); 

                	newLeafNode(otherlv_0, grammarAccess.getHymnAccess().getHymnKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4408:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==49||LA48_0==51||(LA48_0>=54 && LA48_0<=55)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4409:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4409:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4410:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHymnAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleHymn11133);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHymnRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_2=(Token)match(input,106,FOLLOW_106_in_ruleHymn11146); 

                	newLeafNode(otherlv_2, grammarAccess.getHymnAccess().getEndHymnKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHymn"


    // $ANTLR start "entryRuleMedia"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4438:1: entryRuleMedia returns [EObject current=null] : iv_ruleMedia= ruleMedia EOF ;
    public final EObject entryRuleMedia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedia = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4439:2: (iv_ruleMedia= ruleMedia EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4440:2: iv_ruleMedia= ruleMedia EOF
            {
             newCompositeNode(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_ruleMedia_in_entryRuleMedia11182);
            iv_ruleMedia=ruleMedia();

            state._fsp--;

             current =iv_ruleMedia; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMedia11192); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMedia"


    // $ANTLR start "ruleMedia"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4447:1: ruleMedia returns [EObject current=null] : (otherlv_0= 'Media' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Media' ) ;
    public final EObject ruleMedia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4450:28: ( (otherlv_0= 'Media' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Media' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4451:1: (otherlv_0= 'Media' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Media' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4451:1: (otherlv_0= 'Media' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Media' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4451:3: otherlv_0= 'Media' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Media'
            {
            otherlv_0=(Token)match(input,107,FOLLOW_107_in_ruleMedia11229); 

                	newLeafNode(otherlv_0, grammarAccess.getMediaAccess().getMediaKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4455:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==49||LA49_0==51||(LA49_0>=54 && LA49_0<=55)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4456:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4456:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4457:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMediaAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleMedia11250);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMediaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_2=(Token)match(input,108,FOLLOW_108_in_ruleMedia11263); 

                	newLeafNode(otherlv_2, grammarAccess.getMediaAccess().getEndMediaKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMedia"


    // $ANTLR start "entryRuleVerse"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4485:1: entryRuleVerse returns [EObject current=null] : iv_ruleVerse= ruleVerse EOF ;
    public final EObject entryRuleVerse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerse = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4486:2: (iv_ruleVerse= ruleVerse EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4487:2: iv_ruleVerse= ruleVerse EOF
            {
             newCompositeNode(grammarAccess.getVerseRule()); 
            pushFollow(FOLLOW_ruleVerse_in_entryRuleVerse11299);
            iv_ruleVerse=ruleVerse();

            state._fsp--;

             current =iv_ruleVerse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerse11309); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerse"


    // $ANTLR start "ruleVerse"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4494:1: ruleVerse returns [EObject current=null] : (otherlv_0= 'Verse' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Verse' ) ;
    public final EObject ruleVerse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4497:28: ( (otherlv_0= 'Verse' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Verse' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4498:1: (otherlv_0= 'Verse' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Verse' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4498:1: (otherlv_0= 'Verse' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Verse' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4498:3: otherlv_0= 'Verse' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Verse'
            {
            otherlv_0=(Token)match(input,109,FOLLOW_109_in_ruleVerse11346); 

                	newLeafNode(otherlv_0, grammarAccess.getVerseAccess().getVerseKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4502:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==49||LA50_0==51||(LA50_0>=54 && LA50_0<=55)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4503:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4503:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4504:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVerseAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleVerse11367);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVerseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_2=(Token)match(input,110,FOLLOW_110_in_ruleVerse11380); 

                	newLeafNode(otherlv_2, grammarAccess.getVerseAccess().getEndVerseKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerse"


    // $ANTLR start "entryRuleActor"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4532:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4533:2: (iv_ruleActor= ruleActor EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4534:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor11416);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor11426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4541:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Actor' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4544:28: ( (otherlv_0= 'Actor' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Actor' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4545:1: (otherlv_0= 'Actor' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Actor' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4545:1: (otherlv_0= 'Actor' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Actor' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4545:3: otherlv_0= 'Actor' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Actor'
            {
            otherlv_0=(Token)match(input,111,FOLLOW_111_in_ruleActor11463); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4549:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==49||LA51_0==51||(LA51_0>=54 && LA51_0<=55)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4550:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4550:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4551:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleActor11484);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_2=(Token)match(input,112,FOLLOW_112_in_ruleActor11497); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getEndActorKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleRubric"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4579:1: entryRuleRubric returns [EObject current=null] : iv_ruleRubric= ruleRubric EOF ;
    public final EObject entryRuleRubric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRubric = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4580:2: (iv_ruleRubric= ruleRubric EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4581:2: iv_ruleRubric= ruleRubric EOF
            {
             newCompositeNode(grammarAccess.getRubricRule()); 
            pushFollow(FOLLOW_ruleRubric_in_entryRuleRubric11533);
            iv_ruleRubric=ruleRubric();

            state._fsp--;

             current =iv_ruleRubric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRubric11543); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRubric"


    // $ANTLR start "ruleRubric"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4588:1: ruleRubric returns [EObject current=null] : (otherlv_0= 'Rubric' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Rubric' ) ;
    public final EObject ruleRubric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4591:28: ( (otherlv_0= 'Rubric' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Rubric' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4592:1: (otherlv_0= 'Rubric' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Rubric' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4592:1: (otherlv_0= 'Rubric' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Rubric' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4592:3: otherlv_0= 'Rubric' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Rubric'
            {
            otherlv_0=(Token)match(input,113,FOLLOW_113_in_ruleRubric11580); 

                	newLeafNode(otherlv_0, grammarAccess.getRubricAccess().getRubricKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4596:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==49||LA52_0==51||(LA52_0>=54 && LA52_0<=55)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4597:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4597:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4598:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRubricAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleRubric11601);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRubricRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_2=(Token)match(input,114,FOLLOW_114_in_ruleRubric11614); 

                	newLeafNode(otherlv_2, grammarAccess.getRubricAccess().getEndRubricKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRubric"


    // $ANTLR start "entryRuleDialog"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4626:1: entryRuleDialog returns [EObject current=null] : iv_ruleDialog= ruleDialog EOF ;
    public final EObject entryRuleDialog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialog = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4627:2: (iv_ruleDialog= ruleDialog EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4628:2: iv_ruleDialog= ruleDialog EOF
            {
             newCompositeNode(grammarAccess.getDialogRule()); 
            pushFollow(FOLLOW_ruleDialog_in_entryRuleDialog11650);
            iv_ruleDialog=ruleDialog();

            state._fsp--;

             current =iv_ruleDialog; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialog11660); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDialog"


    // $ANTLR start "ruleDialog"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4635:1: ruleDialog returns [EObject current=null] : (otherlv_0= 'Dialog' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Dialog' ) ;
    public final EObject ruleDialog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4638:28: ( (otherlv_0= 'Dialog' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Dialog' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4639:1: (otherlv_0= 'Dialog' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Dialog' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4639:1: (otherlv_0= 'Dialog' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Dialog' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4639:3: otherlv_0= 'Dialog' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Dialog'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_115_in_ruleDialog11697); 

                	newLeafNode(otherlv_0, grammarAccess.getDialogAccess().getDialogKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4643:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==49||LA53_0==51||(LA53_0>=54 && LA53_0<=55)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4644:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4644:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4645:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDialogAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleDialog11718);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDialogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_2=(Token)match(input,116,FOLLOW_116_in_ruleDialog11731); 

                	newLeafNode(otherlv_2, grammarAccess.getDialogAccess().getEndDialogKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDialog"


    // $ANTLR start "entryRuleReading"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4673:1: entryRuleReading returns [EObject current=null] : iv_ruleReading= ruleReading EOF ;
    public final EObject entryRuleReading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReading = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4674:2: (iv_ruleReading= ruleReading EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4675:2: iv_ruleReading= ruleReading EOF
            {
             newCompositeNode(grammarAccess.getReadingRule()); 
            pushFollow(FOLLOW_ruleReading_in_entryRuleReading11767);
            iv_ruleReading=ruleReading();

            state._fsp--;

             current =iv_ruleReading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReading11777); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReading"


    // $ANTLR start "ruleReading"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4682:1: ruleReading returns [EObject current=null] : (otherlv_0= 'Reading' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Reading' ) ;
    public final EObject ruleReading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4685:28: ( (otherlv_0= 'Reading' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Reading' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4686:1: (otherlv_0= 'Reading' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Reading' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4686:1: (otherlv_0= 'Reading' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Reading' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4686:3: otherlv_0= 'Reading' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End-Reading'
            {
            otherlv_0=(Token)match(input,117,FOLLOW_117_in_ruleReading11814); 

                	newLeafNode(otherlv_0, grammarAccess.getReadingAccess().getReadingKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4690:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==49||LA54_0==51||(LA54_0>=54 && LA54_0<=55)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4691:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4691:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4692:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReadingAccess().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleReading11835);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReadingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_2=(Token)match(input,118,FOLLOW_118_in_ruleReading11848); 

                	newLeafNode(otherlv_2, grammarAccess.getReadingAccess().getEndReadingKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReading"


    // $ANTLR start "entryRuleHeading1"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4720:1: entryRuleHeading1 returns [EObject current=null] : iv_ruleHeading1= ruleHeading1 EOF ;
    public final EObject entryRuleHeading1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading1 = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4721:2: (iv_ruleHeading1= ruleHeading1 EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4722:2: iv_ruleHeading1= ruleHeading1 EOF
            {
             newCompositeNode(grammarAccess.getHeading1Rule()); 
            pushFollow(FOLLOW_ruleHeading1_in_entryRuleHeading111884);
            iv_ruleHeading1=ruleHeading1();

            state._fsp--;

             current =iv_ruleHeading1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading111894); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeading1"


    // $ANTLR start "ruleHeading1"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4729:1: ruleHeading1 returns [EObject current=null] : (otherlv_0= 'Heading_1' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_1' ) ;
    public final EObject ruleHeading1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4732:28: ( (otherlv_0= 'Heading_1' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_1' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4733:1: (otherlv_0= 'Heading_1' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_1' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4733:1: (otherlv_0= 'Heading_1' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_1' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4733:3: otherlv_0= 'Heading_1' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_1'
            {
            otherlv_0=(Token)match(input,119,FOLLOW_119_in_ruleHeading111931); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading1Access().getHeading_1Keyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4737:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==49||LA55_0==51||(LA55_0>=54 && LA55_0<=55)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4738:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4738:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4739:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeading1Access().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleHeading111952);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeading1Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_2=(Token)match(input,120,FOLLOW_120_in_ruleHeading111965); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading1Access().getEnd_Heading_1Keyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeading1"


    // $ANTLR start "entryRuleHeading2"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4767:1: entryRuleHeading2 returns [EObject current=null] : iv_ruleHeading2= ruleHeading2 EOF ;
    public final EObject entryRuleHeading2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading2 = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4768:2: (iv_ruleHeading2= ruleHeading2 EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4769:2: iv_ruleHeading2= ruleHeading2 EOF
            {
             newCompositeNode(grammarAccess.getHeading2Rule()); 
            pushFollow(FOLLOW_ruleHeading2_in_entryRuleHeading212001);
            iv_ruleHeading2=ruleHeading2();

            state._fsp--;

             current =iv_ruleHeading2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading212011); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeading2"


    // $ANTLR start "ruleHeading2"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4776:1: ruleHeading2 returns [EObject current=null] : (otherlv_0= 'Heading_2' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_2' ) ;
    public final EObject ruleHeading2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4779:28: ( (otherlv_0= 'Heading_2' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_2' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4780:1: (otherlv_0= 'Heading_2' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_2' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4780:1: (otherlv_0= 'Heading_2' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_2' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4780:3: otherlv_0= 'Heading_2' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_2'
            {
            otherlv_0=(Token)match(input,121,FOLLOW_121_in_ruleHeading212048); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading2Access().getHeading_2Keyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4784:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==49||LA56_0==51||(LA56_0>=54 && LA56_0<=55)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4785:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4785:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4786:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeading2Access().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleHeading212069);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeading2Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_2=(Token)match(input,122,FOLLOW_122_in_ruleHeading212082); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading2Access().getEnd_Heading_2Keyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeading2"


    // $ANTLR start "entryRuleHeading3"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4814:1: entryRuleHeading3 returns [EObject current=null] : iv_ruleHeading3= ruleHeading3 EOF ;
    public final EObject entryRuleHeading3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeading3 = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4815:2: (iv_ruleHeading3= ruleHeading3 EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4816:2: iv_ruleHeading3= ruleHeading3 EOF
            {
             newCompositeNode(grammarAccess.getHeading3Rule()); 
            pushFollow(FOLLOW_ruleHeading3_in_entryRuleHeading312118);
            iv_ruleHeading3=ruleHeading3();

            state._fsp--;

             current =iv_ruleHeading3; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeading312128); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeading3"


    // $ANTLR start "ruleHeading3"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4823:1: ruleHeading3 returns [EObject current=null] : (otherlv_0= 'Heading_3' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_3' ) ;
    public final EObject ruleHeading3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_Elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4826:28: ( (otherlv_0= 'Heading_3' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_3' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4827:1: (otherlv_0= 'Heading_3' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_3' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4827:1: (otherlv_0= 'Heading_3' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_3' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4827:3: otherlv_0= 'Heading_3' ( (lv_dsl_Elements_1_0= ruleElementType ) )* otherlv_2= 'End_Heading_3'
            {
            otherlv_0=(Token)match(input,123,FOLLOW_123_in_ruleHeading312165); 

                	newLeafNode(otherlv_0, grammarAccess.getHeading3Access().getHeading_3Keyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4831:1: ( (lv_dsl_Elements_1_0= ruleElementType ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==49||LA57_0==51||(LA57_0>=54 && LA57_0<=55)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4832:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4832:1: (lv_dsl_Elements_1_0= ruleElementType )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4833:3: lv_dsl_Elements_1_0= ruleElementType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHeading3Access().getDsl_ElementsElementTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementType_in_ruleHeading312186);
            	    lv_dsl_Elements_1_0=ruleElementType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHeading3Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_Elements",
            	            		lv_dsl_Elements_1_0, 
            	            		"ElementType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_2=(Token)match(input,124,FOLLOW_124_in_ruleHeading312199); 

                	newLeafNode(otherlv_2, grammarAccess.getHeading3Access().getEnd_Heading_3Keyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeading3"


    // $ANTLR start "entryRuleElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4861:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4862:2: (iv_ruleElementType= ruleElementType EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4863:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType12235);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType12245); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4870:1: ruleElementType returns [EObject current=null] : (this_ResourceText_0= ruleResourceText | this_TaggedText_1= ruleTaggedText | this_Lookup_2= ruleLookup | this_LDP_3= ruleLDP ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_ResourceText_0 = null;

        EObject this_TaggedText_1 = null;

        EObject this_Lookup_2 = null;

        EObject this_LDP_3 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4873:28: ( (this_ResourceText_0= ruleResourceText | this_TaggedText_1= ruleTaggedText | this_Lookup_2= ruleLookup | this_LDP_3= ruleLDP ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4874:1: (this_ResourceText_0= ruleResourceText | this_TaggedText_1= ruleTaggedText | this_Lookup_2= ruleLookup | this_LDP_3= ruleLDP )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4874:1: (this_ResourceText_0= ruleResourceText | this_TaggedText_1= ruleTaggedText | this_Lookup_2= ruleLookup | this_LDP_3= ruleLDP )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt58=1;
                }
                break;
            case 55:
                {
                alt58=2;
                }
                break;
            case 51:
                {
                alt58=3;
                }
                break;
            case 54:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4875:5: this_ResourceText_0= ruleResourceText
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getResourceTextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleResourceText_in_ruleElementType12292);
                    this_ResourceText_0=ruleResourceText();

                    state._fsp--;

                     
                            current = this_ResourceText_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4885:5: this_TaggedText_1= ruleTaggedText
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getTaggedTextParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTaggedText_in_ruleElementType12319);
                    this_TaggedText_1=ruleTaggedText();

                    state._fsp--;

                     
                            current = this_TaggedText_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4895:5: this_Lookup_2= ruleLookup
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getLookupParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLookup_in_ruleElementType12346);
                    this_Lookup_2=ruleLookup();

                    state._fsp--;

                     
                            current = this_Lookup_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4905:5: this_LDP_3= ruleLDP
                    {
                     
                            newCompositeNode(grammarAccess.getElementTypeAccess().getLDPParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLDP_in_ruleElementType12373);
                    this_LDP_3=ruleLDP();

                    state._fsp--;

                     
                            current = this_LDP_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleAid"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4921:1: entryRuleAid returns [EObject current=null] : iv_ruleAid= ruleAid EOF ;
    public final EObject entryRuleAid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAid = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4922:2: (iv_ruleAid= ruleAid EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4923:2: iv_ruleAid= ruleAid EOF
            {
             newCompositeNode(grammarAccess.getAidRule()); 
            pushFollow(FOLLOW_ruleAid_in_entryRuleAid12408);
            iv_ruleAid=ruleAid();

            state._fsp--;

             current =iv_ruleAid; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAid12418); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAid"


    // $ANTLR start "ruleAid"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4930:1: ruleAid returns [EObject current=null] : (otherlv_0= 'AGES_ID' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleAid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4933:28: ( (otherlv_0= 'AGES_ID' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4934:1: (otherlv_0= 'AGES_ID' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4934:1: (otherlv_0= 'AGES_ID' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4934:3: otherlv_0= 'AGES_ID' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,125,FOLLOW_125_in_ruleAid12455); 

                	newLeafNode(otherlv_0, grammarAccess.getAidAccess().getAGES_IDKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4938:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4939:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4939:1: (lv_name_1_0= ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4940:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAidAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAid12476);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAidRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAid"


    // $ANTLR start "entryRuleVersion"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4964:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4965:2: (iv_ruleVersion= ruleVersion EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4966:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion12512);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion12522); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4973:1: ruleVersion returns [EObject current=null] : (otherlv_0= 'Version' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4976:28: ( (otherlv_0= 'Version' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4977:1: (otherlv_0= 'Version' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4977:1: (otherlv_0= 'Version' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4977:3: otherlv_0= 'Version' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,126,FOLLOW_126_in_ruleVersion12559); 

                	newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4981:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4982:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4982:1: (lv_name_1_0= ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:4983:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getVersionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleVersion12580);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVersionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleLitBook"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5007:1: entryRuleLitBook returns [EObject current=null] : iv_ruleLitBook= ruleLitBook EOF ;
    public final EObject entryRuleLitBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLitBook = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5008:2: (iv_ruleLitBook= ruleLitBook EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5009:2: iv_ruleLitBook= ruleLitBook EOF
            {
             newCompositeNode(grammarAccess.getLitBookRule()); 
            pushFollow(FOLLOW_ruleLitBook_in_entryRuleLitBook12616);
            iv_ruleLitBook=ruleLitBook();

            state._fsp--;

             current =iv_ruleLitBook; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLitBook12626); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLitBook"


    // $ANTLR start "ruleLitBook"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5016:1: ruleLitBook returns [EObject current=null] : (otherlv_0= 'LiturgicalBook' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleLitBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5019:28: ( (otherlv_0= 'LiturgicalBook' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5020:1: (otherlv_0= 'LiturgicalBook' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5020:1: (otherlv_0= 'LiturgicalBook' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5020:3: otherlv_0= 'LiturgicalBook' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,127,FOLLOW_127_in_ruleLitBook12663); 

                	newLeafNode(otherlv_0, grammarAccess.getLitBookAccess().getLiturgicalBookKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5024:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5025:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5025:1: (lv_name_1_0= ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5026:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getLitBookAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLitBook12684);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLitBookRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLitBook"


    // $ANTLR start "entryRuleSetLocale"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5050:1: entryRuleSetLocale returns [EObject current=null] : iv_ruleSetLocale= ruleSetLocale EOF ;
    public final EObject entryRuleSetLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetLocale = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5051:2: (iv_ruleSetLocale= ruleSetLocale EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5052:2: iv_ruleSetLocale= ruleSetLocale EOF
            {
             newCompositeNode(grammarAccess.getSetLocaleRule()); 
            pushFollow(FOLLOW_ruleSetLocale_in_entryRuleSetLocale12720);
            iv_ruleSetLocale=ruleSetLocale();

            state._fsp--;

             current =iv_ruleSetLocale; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetLocale12730); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetLocale"


    // $ANTLR start "ruleSetLocale"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5059:1: ruleSetLocale returns [EObject current=null] : (otherlv_0= 'Set_Locale' otherlv_1= 'locale_1' ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) ) otherlv_3= 'locale_2' ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) ) otherlv_5= 'End_Set_Locale' ) ;
    public final EObject ruleSetLocale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_dsl_SetLocale_V1_2_0=null;
        Token otherlv_3=null;
        Token lv_dsl_SetLocale_V2_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5062:28: ( (otherlv_0= 'Set_Locale' otherlv_1= 'locale_1' ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) ) otherlv_3= 'locale_2' ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) ) otherlv_5= 'End_Set_Locale' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5063:1: (otherlv_0= 'Set_Locale' otherlv_1= 'locale_1' ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) ) otherlv_3= 'locale_2' ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) ) otherlv_5= 'End_Set_Locale' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5063:1: (otherlv_0= 'Set_Locale' otherlv_1= 'locale_1' ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) ) otherlv_3= 'locale_2' ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) ) otherlv_5= 'End_Set_Locale' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5063:3: otherlv_0= 'Set_Locale' otherlv_1= 'locale_1' ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) ) otherlv_3= 'locale_2' ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) ) otherlv_5= 'End_Set_Locale'
            {
            otherlv_0=(Token)match(input,128,FOLLOW_128_in_ruleSetLocale12767); 

                	newLeafNode(otherlv_0, grammarAccess.getSetLocaleAccess().getSet_LocaleKeyword_0());
                
            otherlv_1=(Token)match(input,129,FOLLOW_129_in_ruleSetLocale12779); 

                	newLeafNode(otherlv_1, grammarAccess.getSetLocaleAccess().getLocale_1Keyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5071:1: ( (lv_dsl_SetLocale_V1_2_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5072:1: (lv_dsl_SetLocale_V1_2_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5072:1: (lv_dsl_SetLocale_V1_2_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5073:3: lv_dsl_SetLocale_V1_2_0= RULE_STRING
            {
            lv_dsl_SetLocale_V1_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSetLocale12796); 

            			newLeafNode(lv_dsl_SetLocale_V1_2_0, grammarAccess.getSetLocaleAccess().getDsl_SetLocale_V1STRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetLocaleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_SetLocale_V1",
                    		lv_dsl_SetLocale_V1_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,130,FOLLOW_130_in_ruleSetLocale12813); 

                	newLeafNode(otherlv_3, grammarAccess.getSetLocaleAccess().getLocale_2Keyword_3());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5093:1: ( (lv_dsl_SetLocale_V2_4_0= RULE_STRING ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5094:1: (lv_dsl_SetLocale_V2_4_0= RULE_STRING )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5094:1: (lv_dsl_SetLocale_V2_4_0= RULE_STRING )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5095:3: lv_dsl_SetLocale_V2_4_0= RULE_STRING
            {
            lv_dsl_SetLocale_V2_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSetLocale12830); 

            			newLeafNode(lv_dsl_SetLocale_V2_4_0, grammarAccess.getSetLocaleAccess().getDsl_SetLocale_V2STRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetLocaleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_SetLocale_V2",
                    		lv_dsl_SetLocale_V2_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,131,FOLLOW_131_in_ruleSetLocale12847); 

                	newLeafNode(otherlv_5, grammarAccess.getSetLocaleAccess().getEnd_Set_LocaleKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetLocale"


    // $ANTLR start "entryRuleRestoreLocale"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5123:1: entryRuleRestoreLocale returns [EObject current=null] : iv_ruleRestoreLocale= ruleRestoreLocale EOF ;
    public final EObject entryRuleRestoreLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestoreLocale = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5124:2: (iv_ruleRestoreLocale= ruleRestoreLocale EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5125:2: iv_ruleRestoreLocale= ruleRestoreLocale EOF
            {
             newCompositeNode(grammarAccess.getRestoreLocaleRule()); 
            pushFollow(FOLLOW_ruleRestoreLocale_in_entryRuleRestoreLocale12883);
            iv_ruleRestoreLocale=ruleRestoreLocale();

            state._fsp--;

             current =iv_ruleRestoreLocale; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestoreLocale12893); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestoreLocale"


    // $ANTLR start "ruleRestoreLocale"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5132:1: ruleRestoreLocale returns [EObject current=null] : ( (lv_dsl_RestoreLocale_0_0= '@restoreLocale' ) ) ;
    public final EObject ruleRestoreLocale() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_RestoreLocale_0_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5135:28: ( ( (lv_dsl_RestoreLocale_0_0= '@restoreLocale' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5136:1: ( (lv_dsl_RestoreLocale_0_0= '@restoreLocale' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5136:1: ( (lv_dsl_RestoreLocale_0_0= '@restoreLocale' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5137:1: (lv_dsl_RestoreLocale_0_0= '@restoreLocale' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5137:1: (lv_dsl_RestoreLocale_0_0= '@restoreLocale' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5138:3: lv_dsl_RestoreLocale_0_0= '@restoreLocale'
            {
            lv_dsl_RestoreLocale_0_0=(Token)match(input,132,FOLLOW_132_in_ruleRestoreLocale12935); 

                    newLeafNode(lv_dsl_RestoreLocale_0_0, grammarAccess.getRestoreLocaleAccess().getDsl_RestoreLocaleRestoreLocaleKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRestoreLocaleRule());
            	        }
                   		setWithLastConsumed(current, "dsl_RestoreLocale", true, "@restoreLocale");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestoreLocale"


    // $ANTLR start "entryRuleWhenDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5159:1: entryRuleWhenDate returns [EObject current=null] : iv_ruleWhenDate= ruleWhenDate EOF ;
    public final EObject entryRuleWhenDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenDate = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5160:2: (iv_ruleWhenDate= ruleWhenDate EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5161:2: iv_ruleWhenDate= ruleWhenDate EOF
            {
             newCompositeNode(grammarAccess.getWhenDateRule()); 
            pushFollow(FOLLOW_ruleWhenDate_in_entryRuleWhenDate12983);
            iv_ruleWhenDate=ruleWhenDate();

            state._fsp--;

             current =iv_ruleWhenDate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenDate12993); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenDate"


    // $ANTLR start "ruleWhenDate"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5168:1: ruleWhenDate returns [EObject current=null] : (otherlv_0= 'when-date-is' ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenDate_Cases_1_0 = null;

        EObject lv_dsl_WhenDate_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5171:28: ( (otherlv_0= 'when-date-is' ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5172:1: (otherlv_0= 'when-date-is' ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5172:1: (otherlv_0= 'when-date-is' ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5172:3: otherlv_0= 'when-date-is' ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,133,FOLLOW_133_in_ruleWhenDate13030); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenDateAccess().getWhenDateIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5176:1: ( (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=180 && LA59_0<=191)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5177:1: (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5177:1: (lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5178:3: lv_dsl_WhenDate_Cases_1_0= ruleWhenDateCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenDateAccess().getDsl_WhenDate_CasesWhenDateCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenDateCase_in_ruleWhenDate13051);
            	    lv_dsl_WhenDate_Cases_1_0=ruleWhenDateCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenDateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenDate_Cases",
            	            		lv_dsl_WhenDate_Cases_1_0, 
            	            		"WhenDateCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5194:3: ( (lv_dsl_WhenDate_Other_2_0= ruleWhenOther ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==145) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5195:1: (lv_dsl_WhenDate_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5195:1: (lv_dsl_WhenDate_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5196:3: lv_dsl_WhenDate_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenDateAccess().getDsl_WhenDate_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenDate13073);
                    lv_dsl_WhenDate_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenDateRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenDate_Other",
                            		lv_dsl_WhenDate_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,134,FOLLOW_134_in_ruleWhenDate13086); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenDateAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenDate"


    // $ANTLR start "entryRuleWhenDateCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5224:1: entryRuleWhenDateCase returns [EObject current=null] : iv_ruleWhenDateCase= ruleWhenDateCase EOF ;
    public final EObject entryRuleWhenDateCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenDateCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5225:2: (iv_ruleWhenDateCase= ruleWhenDateCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5226:2: iv_ruleWhenDateCase= ruleWhenDateCase EOF
            {
             newCompositeNode(grammarAccess.getWhenDateCaseRule()); 
            pushFollow(FOLLOW_ruleWhenDateCase_in_entryRuleWhenDateCase13122);
            iv_ruleWhenDateCase=ruleWhenDateCase();

            state._fsp--;

             current =iv_ruleWhenDateCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenDateCase13132); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenDateCase"


    // $ANTLR start "ruleWhenDateCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5233:1: ruleWhenDateCase returns [EObject current=null] : ( ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) ) ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) ) otherlv_2= 'use:' ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenDateCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_dsl_WhenDate_Case_Month_0_0 = null;

        EObject lv_dsl_WhenDateCase_Days_1_0 = null;

        EObject lv_dsl_WhenDateCase_True_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5236:28: ( ( ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) ) ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) ) otherlv_2= 'use:' ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5237:1: ( ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) ) ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) ) otherlv_2= 'use:' ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5237:1: ( ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) ) ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) ) otherlv_2= 'use:' ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5237:2: ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) ) ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) ) otherlv_2= 'use:' ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5237:2: ( (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5238:1: (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5238:1: (lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5239:3: lv_dsl_WhenDate_Case_Month_0_0= ruleMonthName
            {
             
            	        newCompositeNode(grammarAccess.getWhenDateCaseAccess().getDsl_WhenDate_Case_MonthMonthNameEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMonthName_in_ruleWhenDateCase13178);
            lv_dsl_WhenDate_Case_Month_0_0=ruleMonthName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenDateCaseRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_WhenDate_Case_Month",
                    		lv_dsl_WhenDate_Case_Month_0_0, 
                    		"MonthName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5255:2: ( (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5256:1: (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5256:1: (lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5257:3: lv_dsl_WhenDateCase_Days_1_0= ruleAbstractDateCase
            {
             
            	        newCompositeNode(grammarAccess.getWhenDateCaseAccess().getDsl_WhenDateCase_DaysAbstractDateCaseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDateCase_in_ruleWhenDateCase13199);
            lv_dsl_WhenDateCase_Days_1_0=ruleAbstractDateCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenDateCaseRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_WhenDateCase_Days",
                    		lv_dsl_WhenDateCase_Days_1_0, 
                    		"AbstractDateCase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,135,FOLLOW_135_in_ruleWhenDateCase13211); 

                	newLeafNode(otherlv_2, grammarAccess.getWhenDateCaseAccess().getUseKeyword_2());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5277:1: ( (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==47||LA61_0==58||LA61_0==67||LA61_0==87||(LA61_0>=89 && LA61_0<=90)||LA61_0==94||LA61_0==97||LA61_0==99||LA61_0==101||LA61_0==103||LA61_0==105||LA61_0==107||LA61_0==109||LA61_0==111||LA61_0==113||LA61_0==115||LA61_0==117||LA61_0==119||LA61_0==121||LA61_0==123||(LA61_0>=125 && LA61_0<=128)||(LA61_0>=132 && LA61_0<=133)||(LA61_0>=138 && LA61_0<=144)||(LA61_0>=146 && LA61_0<=148)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5278:1: (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5278:1: (lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5279:3: lv_dsl_WhenDateCase_True_actions_3_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenDateCaseAccess().getDsl_WhenDateCase_True_actionsAbstractComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenDateCase13232);
            	    lv_dsl_WhenDateCase_True_actions_3_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenDateCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenDateCase_True_actions",
            	            		lv_dsl_WhenDateCase_True_actions_3_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenDateCase"


    // $ANTLR start "entryRuleAbstractDateCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5303:1: entryRuleAbstractDateCase returns [EObject current=null] : iv_ruleAbstractDateCase= ruleAbstractDateCase EOF ;
    public final EObject entryRuleAbstractDateCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDateCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5304:2: (iv_ruleAbstractDateCase= ruleAbstractDateCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5305:2: iv_ruleAbstractDateCase= ruleAbstractDateCase EOF
            {
             newCompositeNode(grammarAccess.getAbstractDateCaseRule()); 
            pushFollow(FOLLOW_ruleAbstractDateCase_in_entryRuleAbstractDateCase13269);
            iv_ruleAbstractDateCase=ruleAbstractDateCase();

            state._fsp--;

             current =iv_ruleAbstractDateCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDateCase13279); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDateCase"


    // $ANTLR start "ruleAbstractDateCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5312:1: ruleAbstractDateCase returns [EObject current=null] : (this_DateRange_0= ruleDateRange | this_DateSet_1= ruleDateSet ) ;
    public final EObject ruleAbstractDateCase() throws RecognitionException {
        EObject current = null;

        EObject this_DateRange_0 = null;

        EObject this_DateSet_1 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5315:28: ( (this_DateRange_0= ruleDateRange | this_DateSet_1= ruleDateSet ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5316:1: (this_DateRange_0= ruleDateRange | this_DateSet_1= ruleDateSet )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5316:1: (this_DateRange_0= ruleDateRange | this_DateSet_1= ruleDateSet )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_INT) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==136) ) {
                    alt62=1;
                }
                else if ( (LA62_1==EOF||LA62_1==135||LA62_1==137) ) {
                    alt62=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5317:5: this_DateRange_0= ruleDateRange
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDateCaseAccess().getDateRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDateRange_in_ruleAbstractDateCase13326);
                    this_DateRange_0=ruleDateRange();

                    state._fsp--;

                     
                            current = this_DateRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5327:5: this_DateSet_1= ruleDateSet
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDateCaseAccess().getDateSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDateSet_in_ruleAbstractDateCase13353);
                    this_DateSet_1=ruleDateSet();

                    state._fsp--;

                     
                            current = this_DateSet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDateCase"


    // $ANTLR start "entryRuleDateRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5343:1: entryRuleDateRange returns [EObject current=null] : iv_ruleDateRange= ruleDateRange EOF ;
    public final EObject entryRuleDateRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateRange = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5344:2: (iv_ruleDateRange= ruleDateRange EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5345:2: iv_ruleDateRange= ruleDateRange EOF
            {
             newCompositeNode(grammarAccess.getDateRangeRule()); 
            pushFollow(FOLLOW_ruleDateRange_in_entryRuleDateRange13388);
            iv_ruleDateRange=ruleDateRange();

            state._fsp--;

             current =iv_ruleDateRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateRange13398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateRange"


    // $ANTLR start "ruleDateRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5352:1: ruleDateRange returns [EObject current=null] : ( ( (lv_dsl_DateRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_DateRange_To_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDateRange() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_DateRange_from_0_0=null;
        Token otherlv_1=null;
        Token lv_dsl_DateRange_To_2_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5355:28: ( ( ( (lv_dsl_DateRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_DateRange_To_2_0= RULE_INT ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5356:1: ( ( (lv_dsl_DateRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_DateRange_To_2_0= RULE_INT ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5356:1: ( ( (lv_dsl_DateRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_DateRange_To_2_0= RULE_INT ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5356:2: ( (lv_dsl_DateRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_DateRange_To_2_0= RULE_INT ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5356:2: ( (lv_dsl_DateRange_from_0_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5357:1: (lv_dsl_DateRange_from_0_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5357:1: (lv_dsl_DateRange_from_0_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5358:3: lv_dsl_DateRange_from_0_0= RULE_INT
            {
            lv_dsl_DateRange_from_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDateRange13440); 

            			newLeafNode(lv_dsl_DateRange_from_0_0, grammarAccess.getDateRangeAccess().getDsl_DateRange_fromINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_DateRange_from",
                    		lv_dsl_DateRange_from_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,136,FOLLOW_136_in_ruleDateRange13457); 

                	newLeafNode(otherlv_1, grammarAccess.getDateRangeAccess().getThruKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5378:1: ( (lv_dsl_DateRange_To_2_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5379:1: (lv_dsl_DateRange_To_2_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5379:1: (lv_dsl_DateRange_To_2_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5380:3: lv_dsl_DateRange_To_2_0= RULE_INT
            {
            lv_dsl_DateRange_To_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDateRange13474); 

            			newLeafNode(lv_dsl_DateRange_To_2_0, grammarAccess.getDateRangeAccess().getDsl_DateRange_ToINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_DateRange_To",
                    		lv_dsl_DateRange_To_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateRange"


    // $ANTLR start "entryRuleDateSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5404:1: entryRuleDateSet returns [EObject current=null] : iv_ruleDateSet= ruleDateSet EOF ;
    public final EObject entryRuleDateSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateSet = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5405:2: (iv_ruleDateSet= ruleDateSet EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5406:2: iv_ruleDateSet= ruleDateSet EOF
            {
             newCompositeNode(grammarAccess.getDateSetRule()); 
            pushFollow(FOLLOW_ruleDateSet_in_entryRuleDateSet13515);
            iv_ruleDateSet=ruleDateSet();

            state._fsp--;

             current =iv_ruleDateSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateSet13525); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateSet"


    // $ANTLR start "ruleDateSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5413:1: ruleDateSet returns [EObject current=null] : ( ( (lv_dslDateSet_Values_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )* ) ;
    public final EObject ruleDateSet() throws RecognitionException {
        EObject current = null;

        Token lv_dslDateSet_Values_0_0=null;
        Token otherlv_1=null;
        Token lv_dslDateSet_Values_2_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5416:28: ( ( ( (lv_dslDateSet_Values_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5417:1: ( ( (lv_dslDateSet_Values_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5417:1: ( ( (lv_dslDateSet_Values_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5417:2: ( (lv_dslDateSet_Values_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5417:2: ( (lv_dslDateSet_Values_0_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5418:1: (lv_dslDateSet_Values_0_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5418:1: (lv_dslDateSet_Values_0_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5419:3: lv_dslDateSet_Values_0_0= RULE_INT
            {
            lv_dslDateSet_Values_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDateSet13567); 

            			newLeafNode(lv_dslDateSet_Values_0_0, grammarAccess.getDateSetAccess().getDslDateSet_ValuesINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateSetRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"dslDateSet_Values",
                    		lv_dslDateSet_Values_0_0, 
                    		"INT");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5435:2: (otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==137) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5435:4: otherlv_1= ',' ( (lv_dslDateSet_Values_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,137,FOLLOW_137_in_ruleDateSet13585); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDateSetAccess().getCommaKeyword_1_0());
            	        
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5439:1: ( (lv_dslDateSet_Values_2_0= RULE_INT ) )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5440:1: (lv_dslDateSet_Values_2_0= RULE_INT )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5440:1: (lv_dslDateSet_Values_2_0= RULE_INT )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5441:3: lv_dslDateSet_Values_2_0= RULE_INT
            	    {
            	    lv_dslDateSet_Values_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDateSet13602); 

            	    			newLeafNode(lv_dslDateSet_Values_2_0, grammarAccess.getDateSetAccess().getDslDateSet_ValuesINTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDateSetRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"dslDateSet_Values",
            	            		lv_dslDateSet_Values_2_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateSet"


    // $ANTLR start "entryRuleWhenDayName"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5465:1: entryRuleWhenDayName returns [EObject current=null] : iv_ruleWhenDayName= ruleWhenDayName EOF ;
    public final EObject entryRuleWhenDayName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenDayName = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5466:2: (iv_ruleWhenDayName= ruleWhenDayName EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5467:2: iv_ruleWhenDayName= ruleWhenDayName EOF
            {
             newCompositeNode(grammarAccess.getWhenDayNameRule()); 
            pushFollow(FOLLOW_ruleWhenDayName_in_entryRuleWhenDayName13645);
            iv_ruleWhenDayName=ruleWhenDayName();

            state._fsp--;

             current =iv_ruleWhenDayName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenDayName13655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenDayName"


    // $ANTLR start "ruleWhenDayName"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5474:1: ruleWhenDayName returns [EObject current=null] : (otherlv_0= 'when-name-of-day-is' ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+ ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenDayName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenDayName_Cases_1_0 = null;

        EObject lv_dsl_WhenDayName_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5477:28: ( (otherlv_0= 'when-name-of-day-is' ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+ ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5478:1: (otherlv_0= 'when-name-of-day-is' ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+ ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5478:1: (otherlv_0= 'when-name-of-day-is' ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+ ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5478:3: otherlv_0= 'when-name-of-day-is' ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+ ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,138,FOLLOW_138_in_ruleWhenDayName13692); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenDayNameAccess().getWhenNameOfDayIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5482:1: ( (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=173 && LA64_0<=179)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5483:1: (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5483:1: (lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5484:3: lv_dsl_WhenDayName_Cases_1_0= ruleWhenDayNameCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenDayNameAccess().getDsl_WhenDayName_CasesWhenDayNameCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenDayNameCase_in_ruleWhenDayName13713);
            	    lv_dsl_WhenDayName_Cases_1_0=ruleWhenDayNameCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenDayNameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenDayName_Cases",
            	            		lv_dsl_WhenDayName_Cases_1_0, 
            	            		"WhenDayNameCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5500:3: ( (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==145) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5501:1: (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5501:1: (lv_dsl_WhenDayName_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5502:3: lv_dsl_WhenDayName_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenDayNameAccess().getDsl_WhenDayName_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenDayName13735);
                    lv_dsl_WhenDayName_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenDayNameRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenDayName_Other",
                            		lv_dsl_WhenDayName_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,134,FOLLOW_134_in_ruleWhenDayName13748); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenDayNameAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenDayName"


    // $ANTLR start "entryRuleWhenDayNameCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5530:1: entryRuleWhenDayNameCase returns [EObject current=null] : iv_ruleWhenDayNameCase= ruleWhenDayNameCase EOF ;
    public final EObject entryRuleWhenDayNameCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenDayNameCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5531:2: (iv_ruleWhenDayNameCase= ruleWhenDayNameCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5532:2: iv_ruleWhenDayNameCase= ruleWhenDayNameCase EOF
            {
             newCompositeNode(grammarAccess.getWhenDayNameCaseRule()); 
            pushFollow(FOLLOW_ruleWhenDayNameCase_in_entryRuleWhenDayNameCase13784);
            iv_ruleWhenDayNameCase=ruleWhenDayNameCase();

            state._fsp--;

             current =iv_ruleWhenDayNameCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenDayNameCase13794); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenDayNameCase"


    // $ANTLR start "ruleWhenDayNameCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5539:1: ruleWhenDayNameCase returns [EObject current=null] : ( ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenDayNameCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dsl_WhenDayNameCase_Days_0_0 = null;

        EObject lv_dsl_WhenDayNameCase_True_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5542:28: ( ( ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5543:1: ( ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5543:1: ( ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5543:2: ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5543:2: ( (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5544:1: (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5544:1: (lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5545:3: lv_dsl_WhenDayNameCase_Days_0_0= ruleAbstractDayNameCase
            {
             
            	        newCompositeNode(grammarAccess.getWhenDayNameCaseAccess().getDsl_WhenDayNameCase_DaysAbstractDayNameCaseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDayNameCase_in_ruleWhenDayNameCase13840);
            lv_dsl_WhenDayNameCase_Days_0_0=ruleAbstractDayNameCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenDayNameCaseRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_WhenDayNameCase_Days",
                    		lv_dsl_WhenDayNameCase_Days_0_0, 
                    		"AbstractDayNameCase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,135,FOLLOW_135_in_ruleWhenDayNameCase13852); 

                	newLeafNode(otherlv_1, grammarAccess.getWhenDayNameCaseAccess().getUseKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5565:1: ( (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==47||LA66_0==58||LA66_0==67||LA66_0==87||(LA66_0>=89 && LA66_0<=90)||LA66_0==94||LA66_0==97||LA66_0==99||LA66_0==101||LA66_0==103||LA66_0==105||LA66_0==107||LA66_0==109||LA66_0==111||LA66_0==113||LA66_0==115||LA66_0==117||LA66_0==119||LA66_0==121||LA66_0==123||(LA66_0>=125 && LA66_0<=128)||(LA66_0>=132 && LA66_0<=133)||(LA66_0>=138 && LA66_0<=144)||(LA66_0>=146 && LA66_0<=148)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5566:1: (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5566:1: (lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5567:3: lv_dsl_WhenDayNameCase_True_actions_2_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenDayNameCaseAccess().getDsl_WhenDayNameCase_True_actionsAbstractComponentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenDayNameCase13873);
            	    lv_dsl_WhenDayNameCase_True_actions_2_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenDayNameCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenDayNameCase_True_actions",
            	            		lv_dsl_WhenDayNameCase_True_actions_2_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenDayNameCase"


    // $ANTLR start "entryRuleAbstractDayNameCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5591:1: entryRuleAbstractDayNameCase returns [EObject current=null] : iv_ruleAbstractDayNameCase= ruleAbstractDayNameCase EOF ;
    public final EObject entryRuleAbstractDayNameCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDayNameCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5592:2: (iv_ruleAbstractDayNameCase= ruleAbstractDayNameCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5593:2: iv_ruleAbstractDayNameCase= ruleAbstractDayNameCase EOF
            {
             newCompositeNode(grammarAccess.getAbstractDayNameCaseRule()); 
            pushFollow(FOLLOW_ruleAbstractDayNameCase_in_entryRuleAbstractDayNameCase13910);
            iv_ruleAbstractDayNameCase=ruleAbstractDayNameCase();

            state._fsp--;

             current =iv_ruleAbstractDayNameCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDayNameCase13920); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDayNameCase"


    // $ANTLR start "ruleAbstractDayNameCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5600:1: ruleAbstractDayNameCase returns [EObject current=null] : (this_DayNameRange_0= ruleDayNameRange | this_DayNameSet_1= ruleDayNameSet ) ;
    public final EObject ruleAbstractDayNameCase() throws RecognitionException {
        EObject current = null;

        EObject this_DayNameRange_0 = null;

        EObject this_DayNameSet_1 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5603:28: ( (this_DayNameRange_0= ruleDayNameRange | this_DayNameSet_1= ruleDayNameSet ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5604:1: (this_DayNameRange_0= ruleDayNameRange | this_DayNameSet_1= ruleDayNameSet )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5604:1: (this_DayNameRange_0= ruleDayNameRange | this_DayNameSet_1= ruleDayNameSet )
            int alt67=2;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5605:5: this_DayNameRange_0= ruleDayNameRange
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDayNameCaseAccess().getDayNameRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDayNameRange_in_ruleAbstractDayNameCase13967);
                    this_DayNameRange_0=ruleDayNameRange();

                    state._fsp--;

                     
                            current = this_DayNameRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5615:5: this_DayNameSet_1= ruleDayNameSet
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDayNameCaseAccess().getDayNameSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDayNameSet_in_ruleAbstractDayNameCase13994);
                    this_DayNameSet_1=ruleDayNameSet();

                    state._fsp--;

                     
                            current = this_DayNameSet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDayNameCase"


    // $ANTLR start "entryRuleDayNameRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5631:1: entryRuleDayNameRange returns [EObject current=null] : iv_ruleDayNameRange= ruleDayNameRange EOF ;
    public final EObject entryRuleDayNameRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDayNameRange = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5632:2: (iv_ruleDayNameRange= ruleDayNameRange EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5633:2: iv_ruleDayNameRange= ruleDayNameRange EOF
            {
             newCompositeNode(grammarAccess.getDayNameRangeRule()); 
            pushFollow(FOLLOW_ruleDayNameRange_in_entryRuleDayNameRange14029);
            iv_ruleDayNameRange=ruleDayNameRange();

            state._fsp--;

             current =iv_ruleDayNameRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDayNameRange14039); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDayNameRange"


    // $ANTLR start "ruleDayNameRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5640:1: ruleDayNameRange returns [EObject current=null] : ( ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) ) otherlv_1= 'thru' ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) ) ) ;
    public final EObject ruleDayNameRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_dsl_DayNameRange_from_0_0 = null;

        Enumerator lv_dsl_DayNameRange_To_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5643:28: ( ( ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) ) otherlv_1= 'thru' ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5644:1: ( ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) ) otherlv_1= 'thru' ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5644:1: ( ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) ) otherlv_1= 'thru' ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5644:2: ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) ) otherlv_1= 'thru' ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5644:2: ( (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5645:1: (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5645:1: (lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5646:3: lv_dsl_DayNameRange_from_0_0= ruleDayOfWeek
            {
             
            	        newCompositeNode(grammarAccess.getDayNameRangeAccess().getDsl_DayNameRange_fromDayOfWeekEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDayOfWeek_in_ruleDayNameRange14085);
            lv_dsl_DayNameRange_from_0_0=ruleDayOfWeek();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDayNameRangeRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_DayNameRange_from",
                    		lv_dsl_DayNameRange_from_0_0, 
                    		"DayOfWeek");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,136,FOLLOW_136_in_ruleDayNameRange14097); 

                	newLeafNode(otherlv_1, grammarAccess.getDayNameRangeAccess().getThruKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5666:1: ( (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5667:1: (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5667:1: (lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5668:3: lv_dsl_DayNameRange_To_2_0= ruleDayOfWeek
            {
             
            	        newCompositeNode(grammarAccess.getDayNameRangeAccess().getDsl_DayNameRange_ToDayOfWeekEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDayOfWeek_in_ruleDayNameRange14118);
            lv_dsl_DayNameRange_To_2_0=ruleDayOfWeek();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDayNameRangeRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_DayNameRange_To",
                    		lv_dsl_DayNameRange_To_2_0, 
                    		"DayOfWeek");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDayNameRange"


    // $ANTLR start "entryRuleDayNameSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5692:1: entryRuleDayNameSet returns [EObject current=null] : iv_ruleDayNameSet= ruleDayNameSet EOF ;
    public final EObject entryRuleDayNameSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDayNameSet = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5693:2: (iv_ruleDayNameSet= ruleDayNameSet EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5694:2: iv_ruleDayNameSet= ruleDayNameSet EOF
            {
             newCompositeNode(grammarAccess.getDayNameSetRule()); 
            pushFollow(FOLLOW_ruleDayNameSet_in_entryRuleDayNameSet14154);
            iv_ruleDayNameSet=ruleDayNameSet();

            state._fsp--;

             current =iv_ruleDayNameSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDayNameSet14164); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDayNameSet"


    // $ANTLR start "ruleDayNameSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5701:1: ruleDayNameSet returns [EObject current=null] : ( ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) ) (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )* ) ;
    public final EObject ruleDayNameSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_dslDayNameSet_Values_0_0 = null;

        Enumerator lv_dslDayNameSet_Values_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5704:28: ( ( ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) ) (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5705:1: ( ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) ) (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5705:1: ( ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) ) (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5705:2: ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) ) (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5705:2: ( (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5706:1: (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5706:1: (lv_dslDayNameSet_Values_0_0= ruleDayOfWeek )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5707:3: lv_dslDayNameSet_Values_0_0= ruleDayOfWeek
            {
             
            	        newCompositeNode(grammarAccess.getDayNameSetAccess().getDslDayNameSet_ValuesDayOfWeekEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDayOfWeek_in_ruleDayNameSet14210);
            lv_dslDayNameSet_Values_0_0=ruleDayOfWeek();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDayNameSetRule());
            	        }
                   		add(
                   			current, 
                   			"dslDayNameSet_Values",
                    		lv_dslDayNameSet_Values_0_0, 
                    		"DayOfWeek");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5723:2: (otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==137) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5723:4: otherlv_1= ',' ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) )
            	    {
            	    otherlv_1=(Token)match(input,137,FOLLOW_137_in_ruleDayNameSet14223); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDayNameSetAccess().getCommaKeyword_1_0());
            	        
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5727:1: ( (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek ) )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5728:1: (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5728:1: (lv_dslDayNameSet_Values_2_0= ruleDayOfWeek )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5729:3: lv_dslDayNameSet_Values_2_0= ruleDayOfWeek
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDayNameSetAccess().getDslDayNameSet_ValuesDayOfWeekEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDayOfWeek_in_ruleDayNameSet14244);
            	    lv_dslDayNameSet_Values_2_0=ruleDayOfWeek();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDayNameSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dslDayNameSet_Values",
            	            		lv_dslDayNameSet_Values_2_0, 
            	            		"DayOfWeek");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDayNameSet"


    // $ANTLR start "entryRuleWhenPentecostarionDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5753:1: entryRuleWhenPentecostarionDay returns [EObject current=null] : iv_ruleWhenPentecostarionDay= ruleWhenPentecostarionDay EOF ;
    public final EObject entryRuleWhenPentecostarionDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenPentecostarionDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5754:2: (iv_ruleWhenPentecostarionDay= ruleWhenPentecostarionDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5755:2: iv_ruleWhenPentecostarionDay= ruleWhenPentecostarionDay EOF
            {
             newCompositeNode(grammarAccess.getWhenPentecostarionDayRule()); 
            pushFollow(FOLLOW_ruleWhenPentecostarionDay_in_entryRuleWhenPentecostarionDay14282);
            iv_ruleWhenPentecostarionDay=ruleWhenPentecostarionDay();

            state._fsp--;

             current =iv_ruleWhenPentecostarionDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenPentecostarionDay14292); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenPentecostarionDay"


    // $ANTLR start "ruleWhenPentecostarionDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5762:1: ruleWhenPentecostarionDay returns [EObject current=null] : (otherlv_0= 'when-pentecostarion-day-is' ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenPentecostarionDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenPentecostarionDay_Cases_1_0 = null;

        EObject lv_dsl_WhenPentecostarionDay_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5765:28: ( (otherlv_0= 'when-pentecostarion-day-is' ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5766:1: (otherlv_0= 'when-pentecostarion-day-is' ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5766:1: (otherlv_0= 'when-pentecostarion-day-is' ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5766:3: otherlv_0= 'when-pentecostarion-day-is' ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,139,FOLLOW_139_in_ruleWhenPentecostarionDay14329); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenPentecostarionDayAccess().getWhenPentecostarionDayIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5770:1: ( (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase ) )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_INT) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5771:1: (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5771:1: (lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5772:3: lv_dsl_WhenPentecostarionDay_Cases_1_0= ruleWhenPeriodCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenPentecostarionDayAccess().getDsl_WhenPentecostarionDay_CasesWhenPeriodCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenPeriodCase_in_ruleWhenPentecostarionDay14350);
            	    lv_dsl_WhenPentecostarionDay_Cases_1_0=ruleWhenPeriodCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenPentecostarionDayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenPentecostarionDay_Cases",
            	            		lv_dsl_WhenPentecostarionDay_Cases_1_0, 
            	            		"WhenPeriodCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5788:3: ( (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==145) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5789:1: (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5789:1: (lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5790:3: lv_dsl_WhenPentecostarionDay_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenPentecostarionDayAccess().getDsl_WhenPentecostarionDay_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenPentecostarionDay14372);
                    lv_dsl_WhenPentecostarionDay_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenPentecostarionDayRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenPentecostarionDay_Other",
                            		lv_dsl_WhenPentecostarionDay_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,134,FOLLOW_134_in_ruleWhenPentecostarionDay14385); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenPentecostarionDayAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenPentecostarionDay"


    // $ANTLR start "entryRuleWhenTriodionDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5818:1: entryRuleWhenTriodionDay returns [EObject current=null] : iv_ruleWhenTriodionDay= ruleWhenTriodionDay EOF ;
    public final EObject entryRuleWhenTriodionDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenTriodionDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5819:2: (iv_ruleWhenTriodionDay= ruleWhenTriodionDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5820:2: iv_ruleWhenTriodionDay= ruleWhenTriodionDay EOF
            {
             newCompositeNode(grammarAccess.getWhenTriodionDayRule()); 
            pushFollow(FOLLOW_ruleWhenTriodionDay_in_entryRuleWhenTriodionDay14421);
            iv_ruleWhenTriodionDay=ruleWhenTriodionDay();

            state._fsp--;

             current =iv_ruleWhenTriodionDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenTriodionDay14431); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenTriodionDay"


    // $ANTLR start "ruleWhenTriodionDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5827:1: ruleWhenTriodionDay returns [EObject current=null] : (otherlv_0= 'when-triodion-day-is' ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenTriodionDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenTriodionDay_Cases_1_0 = null;

        EObject lv_dsl_WhenTriodionDay_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5830:28: ( (otherlv_0= 'when-triodion-day-is' ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5831:1: (otherlv_0= 'when-triodion-day-is' ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5831:1: (otherlv_0= 'when-triodion-day-is' ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5831:3: otherlv_0= 'when-triodion-day-is' ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,140,FOLLOW_140_in_ruleWhenTriodionDay14468); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenTriodionDayAccess().getWhenTriodionDayIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5835:1: ( (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_INT) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5836:1: (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5836:1: (lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5837:3: lv_dsl_WhenTriodionDay_Cases_1_0= ruleWhenPeriodCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenTriodionDayAccess().getDsl_WhenTriodionDay_CasesWhenPeriodCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenPeriodCase_in_ruleWhenTriodionDay14489);
            	    lv_dsl_WhenTriodionDay_Cases_1_0=ruleWhenPeriodCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenTriodionDayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenTriodionDay_Cases",
            	            		lv_dsl_WhenTriodionDay_Cases_1_0, 
            	            		"WhenPeriodCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5853:3: ( (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==145) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5854:1: (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5854:1: (lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5855:3: lv_dsl_WhenTriodionDay_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenTriodionDayAccess().getDsl_WhenTriodionDay_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenTriodionDay14511);
                    lv_dsl_WhenTriodionDay_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenTriodionDayRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenTriodionDay_Other",
                            		lv_dsl_WhenTriodionDay_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,134,FOLLOW_134_in_ruleWhenTriodionDay14524); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenTriodionDayAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenTriodionDay"


    // $ANTLR start "entryRuleWhenMovableCycleDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5883:1: entryRuleWhenMovableCycleDay returns [EObject current=null] : iv_ruleWhenMovableCycleDay= ruleWhenMovableCycleDay EOF ;
    public final EObject entryRuleWhenMovableCycleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenMovableCycleDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5884:2: (iv_ruleWhenMovableCycleDay= ruleWhenMovableCycleDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5885:2: iv_ruleWhenMovableCycleDay= ruleWhenMovableCycleDay EOF
            {
             newCompositeNode(grammarAccess.getWhenMovableCycleDayRule()); 
            pushFollow(FOLLOW_ruleWhenMovableCycleDay_in_entryRuleWhenMovableCycleDay14560);
            iv_ruleWhenMovableCycleDay=ruleWhenMovableCycleDay();

            state._fsp--;

             current =iv_ruleWhenMovableCycleDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenMovableCycleDay14570); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenMovableCycleDay"


    // $ANTLR start "ruleWhenMovableCycleDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5892:1: ruleWhenMovableCycleDay returns [EObject current=null] : (otherlv_0= 'when-movable-cycle-day-is' ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenMovableCycleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenMovableCycleDay_Cases_1_0 = null;

        EObject lv_dsl_WhenMovableCycleDay_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5895:28: ( (otherlv_0= 'when-movable-cycle-day-is' ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5896:1: (otherlv_0= 'when-movable-cycle-day-is' ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5896:1: (otherlv_0= 'when-movable-cycle-day-is' ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5896:3: otherlv_0= 'when-movable-cycle-day-is' ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,141,FOLLOW_141_in_ruleWhenMovableCycleDay14607); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenMovableCycleDayAccess().getWhenMovableCycleDayIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5900:1: ( (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_INT) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5901:1: (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5901:1: (lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5902:3: lv_dsl_WhenMovableCycleDay_Cases_1_0= ruleWhenPeriodCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenMovableCycleDayAccess().getDsl_WhenMovableCycleDay_CasesWhenPeriodCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenPeriodCase_in_ruleWhenMovableCycleDay14628);
            	    lv_dsl_WhenMovableCycleDay_Cases_1_0=ruleWhenPeriodCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenMovableCycleDayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenMovableCycleDay_Cases",
            	            		lv_dsl_WhenMovableCycleDay_Cases_1_0, 
            	            		"WhenPeriodCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5918:3: ( (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==145) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5919:1: (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5919:1: (lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5920:3: lv_dsl_WhenMovableCycleDay_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenMovableCycleDayAccess().getDsl_WhenMovableCycleDay_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenMovableCycleDay14650);
                    lv_dsl_WhenMovableCycleDay_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenMovableCycleDayRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenMovableCycleDay_Other",
                            		lv_dsl_WhenMovableCycleDay_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,134,FOLLOW_134_in_ruleWhenMovableCycleDay14663); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenMovableCycleDayAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenMovableCycleDay"


    // $ANTLR start "entryRuleWhenSundayAfterElevationOfCrossDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5948:1: entryRuleWhenSundayAfterElevationOfCrossDay returns [EObject current=null] : iv_ruleWhenSundayAfterElevationOfCrossDay= ruleWhenSundayAfterElevationOfCrossDay EOF ;
    public final EObject entryRuleWhenSundayAfterElevationOfCrossDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenSundayAfterElevationOfCrossDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5949:2: (iv_ruleWhenSundayAfterElevationOfCrossDay= ruleWhenSundayAfterElevationOfCrossDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5950:2: iv_ruleWhenSundayAfterElevationOfCrossDay= ruleWhenSundayAfterElevationOfCrossDay EOF
            {
             newCompositeNode(grammarAccess.getWhenSundayAfterElevationOfCrossDayRule()); 
            pushFollow(FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_entryRuleWhenSundayAfterElevationOfCrossDay14699);
            iv_ruleWhenSundayAfterElevationOfCrossDay=ruleWhenSundayAfterElevationOfCrossDay();

            state._fsp--;

             current =iv_ruleWhenSundayAfterElevationOfCrossDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenSundayAfterElevationOfCrossDay14709); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenSundayAfterElevationOfCrossDay"


    // $ANTLR start "ruleWhenSundayAfterElevationOfCrossDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5957:1: ruleWhenSundayAfterElevationOfCrossDay returns [EObject current=null] : (otherlv_0= 'when-Sunday-after-Elevation-of-Cross-is' ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenSundayAfterElevationOfCrossDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0 = null;

        EObject lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5960:28: ( (otherlv_0= 'when-Sunday-after-Elevation-of-Cross-is' ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5961:1: (otherlv_0= 'when-Sunday-after-Elevation-of-Cross-is' ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5961:1: (otherlv_0= 'when-Sunday-after-Elevation-of-Cross-is' ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5961:3: otherlv_0= 'when-Sunday-after-Elevation-of-Cross-is' ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+ ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,142,FOLLOW_142_in_ruleWhenSundayAfterElevationOfCrossDay14746); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenSundayAfterElevationOfCrossDayAccess().getWhenSundayAfterElevationOfCrossIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5965:1: ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase ) )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=180 && LA75_0<=191)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5966:1: (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5966:1: (lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5967:3: lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0= ruleWhenDateCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenSundayAfterElevationOfCrossDayAccess().getDsl_WhenSundayAfterElevationOfCrossDay_CasesWhenDateCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenDateCase_in_ruleWhenSundayAfterElevationOfCrossDay14767);
            	    lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0=ruleWhenDateCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenSundayAfterElevationOfCrossDayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenSundayAfterElevationOfCrossDay_Cases",
            	            		lv_dsl_WhenSundayAfterElevationOfCrossDay_Cases_1_0, 
            	            		"WhenDateCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5983:3: ( (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==145) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5984:1: (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5984:1: (lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:5985:3: lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenSundayAfterElevationOfCrossDayAccess().getDsl_WhenSundayAfterElevationOfCrossDay_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenSundayAfterElevationOfCrossDay14789);
                    lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenSundayAfterElevationOfCrossDayRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenSundayAfterElevationOfCrossDay_Other",
                            		lv_dsl_WhenSundayAfterElevationOfCrossDay_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,134,FOLLOW_134_in_ruleWhenSundayAfterElevationOfCrossDay14802); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenSundayAfterElevationOfCrossDayAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenSundayAfterElevationOfCrossDay"


    // $ANTLR start "entryRuleWhenLukanCycleDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6013:1: entryRuleWhenLukanCycleDay returns [EObject current=null] : iv_ruleWhenLukanCycleDay= ruleWhenLukanCycleDay EOF ;
    public final EObject entryRuleWhenLukanCycleDay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenLukanCycleDay = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6014:2: (iv_ruleWhenLukanCycleDay= ruleWhenLukanCycleDay EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6015:2: iv_ruleWhenLukanCycleDay= ruleWhenLukanCycleDay EOF
            {
             newCompositeNode(grammarAccess.getWhenLukanCycleDayRule()); 
            pushFollow(FOLLOW_ruleWhenLukanCycleDay_in_entryRuleWhenLukanCycleDay14838);
            iv_ruleWhenLukanCycleDay=ruleWhenLukanCycleDay();

            state._fsp--;

             current =iv_ruleWhenLukanCycleDay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenLukanCycleDay14848); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenLukanCycleDay"


    // $ANTLR start "ruleWhenLukanCycleDay"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6022:1: ruleWhenLukanCycleDay returns [EObject current=null] : (otherlv_0= 'when-Lukan-Cycle-Day-is' ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenLukanCycleDay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenLukanCycleDay_Cases_1_0 = null;

        EObject lv_dsl_WhenLukanCycleDay_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6025:28: ( (otherlv_0= 'when-Lukan-Cycle-Day-is' ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6026:1: (otherlv_0= 'when-Lukan-Cycle-Day-is' ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6026:1: (otherlv_0= 'when-Lukan-Cycle-Day-is' ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6026:3: otherlv_0= 'when-Lukan-Cycle-Day-is' ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+ ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,143,FOLLOW_143_in_ruleWhenLukanCycleDay14885); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenLukanCycleDayAccess().getWhenLukanCycleDayIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6030:1: ( (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase ) )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_INT) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6031:1: (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6031:1: (lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6032:3: lv_dsl_WhenLukanCycleDay_Cases_1_0= ruleWhenPeriodCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenLukanCycleDayAccess().getDsl_WhenLukanCycleDay_CasesWhenPeriodCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenPeriodCase_in_ruleWhenLukanCycleDay14906);
            	    lv_dsl_WhenLukanCycleDay_Cases_1_0=ruleWhenPeriodCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenLukanCycleDayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenLukanCycleDay_Cases",
            	            		lv_dsl_WhenLukanCycleDay_Cases_1_0, 
            	            		"WhenPeriodCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6048:3: ( (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==145) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6049:1: (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6049:1: (lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6050:3: lv_dsl_WhenLukanCycleDay_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenLukanCycleDayAccess().getDsl_WhenLukanCycleDay_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenLukanCycleDay14928);
                    lv_dsl_WhenLukanCycleDay_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenLukanCycleDayRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenLukanCycleDay_Other",
                            		lv_dsl_WhenLukanCycleDay_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,134,FOLLOW_134_in_ruleWhenLukanCycleDay14941); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenLukanCycleDayAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenLukanCycleDay"


    // $ANTLR start "entryRuleWhenPascha"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6078:1: entryRuleWhenPascha returns [EObject current=null] : iv_ruleWhenPascha= ruleWhenPascha EOF ;
    public final EObject entryRuleWhenPascha() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenPascha = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6079:2: (iv_ruleWhenPascha= ruleWhenPascha EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6080:2: iv_ruleWhenPascha= ruleWhenPascha EOF
            {
             newCompositeNode(grammarAccess.getWhenPaschaRule()); 
            pushFollow(FOLLOW_ruleWhenPascha_in_entryRuleWhenPascha14977);
            iv_ruleWhenPascha=ruleWhenPascha();

            state._fsp--;

             current =iv_ruleWhenPascha; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenPascha14987); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenPascha"


    // $ANTLR start "ruleWhenPascha"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6087:1: ruleWhenPascha returns [EObject current=null] : (otherlv_0= 'when-pascha use:' ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )* (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )? otherlv_4= 'end-when' ) ;
    public final EObject ruleWhenPascha() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dsl_WhenPascha_true_actions_1_0 = null;

        EObject lv_dsl_WhenPascha_Other_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6090:28: ( (otherlv_0= 'when-pascha use:' ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )* (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )? otherlv_4= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6091:1: (otherlv_0= 'when-pascha use:' ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )* (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )? otherlv_4= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6091:1: (otherlv_0= 'when-pascha use:' ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )* (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )? otherlv_4= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6091:3: otherlv_0= 'when-pascha use:' ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )* (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )? otherlv_4= 'end-when'
            {
            otherlv_0=(Token)match(input,144,FOLLOW_144_in_ruleWhenPascha15024); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenPaschaAccess().getWhenPaschaUseKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6095:1: ( (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==47||LA79_0==58||LA79_0==67||LA79_0==87||(LA79_0>=89 && LA79_0<=90)||LA79_0==94||LA79_0==97||LA79_0==99||LA79_0==101||LA79_0==103||LA79_0==105||LA79_0==107||LA79_0==109||LA79_0==111||LA79_0==113||LA79_0==115||LA79_0==117||LA79_0==119||LA79_0==121||LA79_0==123||(LA79_0>=125 && LA79_0<=128)||(LA79_0>=132 && LA79_0<=133)||(LA79_0>=138 && LA79_0<=144)||(LA79_0>=146 && LA79_0<=148)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6096:1: (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6096:1: (lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6097:3: lv_dsl_WhenPascha_true_actions_1_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenPaschaAccess().getDsl_WhenPascha_true_actionsAbstractComponentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenPascha15045);
            	    lv_dsl_WhenPascha_true_actions_1_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenPaschaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenPascha_true_actions",
            	            		lv_dsl_WhenPascha_true_actions_1_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6113:3: (otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==145) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6113:5: otherlv_2= 'otherwise use:' ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )*
                    {
                    otherlv_2=(Token)match(input,145,FOLLOW_145_in_ruleWhenPascha15059); 

                        	newLeafNode(otherlv_2, grammarAccess.getWhenPaschaAccess().getOtherwiseUseKeyword_2_0());
                        
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6117:1: ( (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==47||LA80_0==58||LA80_0==67||LA80_0==87||(LA80_0>=89 && LA80_0<=90)||LA80_0==94||LA80_0==97||LA80_0==99||LA80_0==101||LA80_0==103||LA80_0==105||LA80_0==107||LA80_0==109||LA80_0==111||LA80_0==113||LA80_0==115||LA80_0==117||LA80_0==119||LA80_0==121||LA80_0==123||(LA80_0>=125 && LA80_0<=128)||(LA80_0>=132 && LA80_0<=133)||(LA80_0>=138 && LA80_0<=144)||(LA80_0>=146 && LA80_0<=148)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6118:1: (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent )
                    	    {
                    	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6118:1: (lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent )
                    	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6119:3: lv_dsl_WhenPascha_Other_actions_3_0= ruleAbstractComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWhenPaschaAccess().getDsl_WhenPascha_Other_actionsAbstractComponentParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenPascha15080);
                    	    lv_dsl_WhenPascha_Other_actions_3_0=ruleAbstractComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWhenPaschaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"dsl_WhenPascha_Other_actions",
                    	            		lv_dsl_WhenPascha_Other_actions_3_0, 
                    	            		"AbstractComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,134,FOLLOW_134_in_ruleWhenPascha15095); 

                	newLeafNode(otherlv_4, grammarAccess.getWhenPaschaAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenPascha"


    // $ANTLR start "entryRuleWhenOther"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6147:1: entryRuleWhenOther returns [EObject current=null] : iv_ruleWhenOther= ruleWhenOther EOF ;
    public final EObject entryRuleWhenOther() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenOther = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6148:2: (iv_ruleWhenOther= ruleWhenOther EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6149:2: iv_ruleWhenOther= ruleWhenOther EOF
            {
             newCompositeNode(grammarAccess.getWhenOtherRule()); 
            pushFollow(FOLLOW_ruleWhenOther_in_entryRuleWhenOther15131);
            iv_ruleWhenOther=ruleWhenOther();

            state._fsp--;

             current =iv_ruleWhenOther; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenOther15141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenOther"


    // $ANTLR start "ruleWhenOther"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6156:1: ruleWhenOther returns [EObject current=null] : (otherlv_0= 'otherwise use:' ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenOther() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_dsl_WhenCase_Other_actions_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6159:28: ( (otherlv_0= 'otherwise use:' ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6160:1: (otherlv_0= 'otherwise use:' ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6160:1: (otherlv_0= 'otherwise use:' ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6160:3: otherlv_0= 'otherwise use:' ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )*
            {
            otherlv_0=(Token)match(input,145,FOLLOW_145_in_ruleWhenOther15178); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenOtherAccess().getOtherwiseUseKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6164:1: ( (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==47||LA82_0==58||LA82_0==67||LA82_0==87||(LA82_0>=89 && LA82_0<=90)||LA82_0==94||LA82_0==97||LA82_0==99||LA82_0==101||LA82_0==103||LA82_0==105||LA82_0==107||LA82_0==109||LA82_0==111||LA82_0==113||LA82_0==115||LA82_0==117||LA82_0==119||LA82_0==121||LA82_0==123||(LA82_0>=125 && LA82_0<=128)||(LA82_0>=132 && LA82_0<=133)||(LA82_0>=138 && LA82_0<=144)||(LA82_0>=146 && LA82_0<=148)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6165:1: (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6165:1: (lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6166:3: lv_dsl_WhenCase_Other_actions_1_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenOtherAccess().getDsl_WhenCase_Other_actionsAbstractComponentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenOther15199);
            	    lv_dsl_WhenCase_Other_actions_1_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenOtherRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenCase_Other_actions",
            	            		lv_dsl_WhenCase_Other_actions_1_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenOther"


    // $ANTLR start "entryRuleWhenPeriodCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6190:1: entryRuleWhenPeriodCase returns [EObject current=null] : iv_ruleWhenPeriodCase= ruleWhenPeriodCase EOF ;
    public final EObject entryRuleWhenPeriodCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenPeriodCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6191:2: (iv_ruleWhenPeriodCase= ruleWhenPeriodCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6192:2: iv_ruleWhenPeriodCase= ruleWhenPeriodCase EOF
            {
             newCompositeNode(grammarAccess.getWhenPeriodCaseRule()); 
            pushFollow(FOLLOW_ruleWhenPeriodCase_in_entryRuleWhenPeriodCase15236);
            iv_ruleWhenPeriodCase=ruleWhenPeriodCase();

            state._fsp--;

             current =iv_ruleWhenPeriodCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenPeriodCase15246); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenPeriodCase"


    // $ANTLR start "ruleWhenPeriodCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6199:1: ruleWhenPeriodCase returns [EObject current=null] : ( ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenPeriodCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dsl_WhenPeriodCase_Days_0_0 = null;

        EObject lv_dsl_WhenPeriodCase_True_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6202:28: ( ( ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6203:1: ( ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6203:1: ( ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6203:2: ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) ) otherlv_1= 'use:' ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6203:2: ( (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6204:1: (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6204:1: (lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6205:3: lv_dsl_WhenPeriodCase_Days_0_0= ruleAbstractDayCase
            {
             
            	        newCompositeNode(grammarAccess.getWhenPeriodCaseAccess().getDsl_WhenPeriodCase_DaysAbstractDayCaseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDayCase_in_ruleWhenPeriodCase15292);
            lv_dsl_WhenPeriodCase_Days_0_0=ruleAbstractDayCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenPeriodCaseRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_WhenPeriodCase_Days",
                    		lv_dsl_WhenPeriodCase_Days_0_0, 
                    		"AbstractDayCase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,135,FOLLOW_135_in_ruleWhenPeriodCase15304); 

                	newLeafNode(otherlv_1, grammarAccess.getWhenPeriodCaseAccess().getUseKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6225:1: ( (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==47||LA83_0==58||LA83_0==67||LA83_0==87||(LA83_0>=89 && LA83_0<=90)||LA83_0==94||LA83_0==97||LA83_0==99||LA83_0==101||LA83_0==103||LA83_0==105||LA83_0==107||LA83_0==109||LA83_0==111||LA83_0==113||LA83_0==115||LA83_0==117||LA83_0==119||LA83_0==121||LA83_0==123||(LA83_0>=125 && LA83_0<=128)||(LA83_0>=132 && LA83_0<=133)||(LA83_0>=138 && LA83_0<=144)||(LA83_0>=146 && LA83_0<=148)) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6226:1: (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6226:1: (lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6227:3: lv_dsl_WhenPeriodCase_True_actions_2_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenPeriodCaseAccess().getDsl_WhenPeriodCase_True_actionsAbstractComponentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenPeriodCase15325);
            	    lv_dsl_WhenPeriodCase_True_actions_2_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenPeriodCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenPeriodCase_True_actions",
            	            		lv_dsl_WhenPeriodCase_True_actions_2_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenPeriodCase"


    // $ANTLR start "entryRuleAbstractDayCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6251:1: entryRuleAbstractDayCase returns [EObject current=null] : iv_ruleAbstractDayCase= ruleAbstractDayCase EOF ;
    public final EObject entryRuleAbstractDayCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDayCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6252:2: (iv_ruleAbstractDayCase= ruleAbstractDayCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6253:2: iv_ruleAbstractDayCase= ruleAbstractDayCase EOF
            {
             newCompositeNode(grammarAccess.getAbstractDayCaseRule()); 
            pushFollow(FOLLOW_ruleAbstractDayCase_in_entryRuleAbstractDayCase15362);
            iv_ruleAbstractDayCase=ruleAbstractDayCase();

            state._fsp--;

             current =iv_ruleAbstractDayCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDayCase15372); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDayCase"


    // $ANTLR start "ruleAbstractDayCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6260:1: ruleAbstractDayCase returns [EObject current=null] : (this_DayRange_0= ruleDayRange | this_DaySet_1= ruleDaySet ) ;
    public final EObject ruleAbstractDayCase() throws RecognitionException {
        EObject current = null;

        EObject this_DayRange_0 = null;

        EObject this_DaySet_1 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6263:28: ( (this_DayRange_0= ruleDayRange | this_DaySet_1= ruleDaySet ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6264:1: (this_DayRange_0= ruleDayRange | this_DaySet_1= ruleDaySet )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6264:1: (this_DayRange_0= ruleDayRange | this_DaySet_1= ruleDaySet )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_INT) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==EOF||LA84_1==135||LA84_1==137) ) {
                    alt84=2;
                }
                else if ( (LA84_1==136) ) {
                    alt84=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6265:5: this_DayRange_0= ruleDayRange
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDayCaseAccess().getDayRangeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDayRange_in_ruleAbstractDayCase15419);
                    this_DayRange_0=ruleDayRange();

                    state._fsp--;

                     
                            current = this_DayRange_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6275:5: this_DaySet_1= ruleDaySet
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDayCaseAccess().getDaySetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDaySet_in_ruleAbstractDayCase15446);
                    this_DaySet_1=ruleDaySet();

                    state._fsp--;

                     
                            current = this_DaySet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDayCase"


    // $ANTLR start "entryRuleDayRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6291:1: entryRuleDayRange returns [EObject current=null] : iv_ruleDayRange= ruleDayRange EOF ;
    public final EObject entryRuleDayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDayRange = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6292:2: (iv_ruleDayRange= ruleDayRange EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6293:2: iv_ruleDayRange= ruleDayRange EOF
            {
             newCompositeNode(grammarAccess.getDayRangeRule()); 
            pushFollow(FOLLOW_ruleDayRange_in_entryRuleDayRange15481);
            iv_ruleDayRange=ruleDayRange();

            state._fsp--;

             current =iv_ruleDayRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDayRange15491); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDayRange"


    // $ANTLR start "ruleDayRange"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6300:1: ruleDayRange returns [EObject current=null] : ( ( (lv_dsl_DayRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_Range_To_2_0= RULE_INT ) ) ) ;
    public final EObject ruleDayRange() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_DayRange_from_0_0=null;
        Token otherlv_1=null;
        Token lv_dsl_Range_To_2_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6303:28: ( ( ( (lv_dsl_DayRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_Range_To_2_0= RULE_INT ) ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6304:1: ( ( (lv_dsl_DayRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_Range_To_2_0= RULE_INT ) ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6304:1: ( ( (lv_dsl_DayRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_Range_To_2_0= RULE_INT ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6304:2: ( (lv_dsl_DayRange_from_0_0= RULE_INT ) ) otherlv_1= 'thru' ( (lv_dsl_Range_To_2_0= RULE_INT ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6304:2: ( (lv_dsl_DayRange_from_0_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6305:1: (lv_dsl_DayRange_from_0_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6305:1: (lv_dsl_DayRange_from_0_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6306:3: lv_dsl_DayRange_from_0_0= RULE_INT
            {
            lv_dsl_DayRange_from_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDayRange15533); 

            			newLeafNode(lv_dsl_DayRange_from_0_0, grammarAccess.getDayRangeAccess().getDsl_DayRange_fromINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDayRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_DayRange_from",
                    		lv_dsl_DayRange_from_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,136,FOLLOW_136_in_ruleDayRange15550); 

                	newLeafNode(otherlv_1, grammarAccess.getDayRangeAccess().getThruKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6326:1: ( (lv_dsl_Range_To_2_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6327:1: (lv_dsl_Range_To_2_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6327:1: (lv_dsl_Range_To_2_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6328:3: lv_dsl_Range_To_2_0= RULE_INT
            {
            lv_dsl_Range_To_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDayRange15567); 

            			newLeafNode(lv_dsl_Range_To_2_0, grammarAccess.getDayRangeAccess().getDsl_Range_ToINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDayRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_Range_To",
                    		lv_dsl_Range_To_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDayRange"


    // $ANTLR start "entryRuleDaySet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6352:1: entryRuleDaySet returns [EObject current=null] : iv_ruleDaySet= ruleDaySet EOF ;
    public final EObject entryRuleDaySet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDaySet = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6353:2: (iv_ruleDaySet= ruleDaySet EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6354:2: iv_ruleDaySet= ruleDaySet EOF
            {
             newCompositeNode(grammarAccess.getDaySetRule()); 
            pushFollow(FOLLOW_ruleDaySet_in_entryRuleDaySet15608);
            iv_ruleDaySet=ruleDaySet();

            state._fsp--;

             current =iv_ruleDaySet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDaySet15618); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDaySet"


    // $ANTLR start "ruleDaySet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6361:1: ruleDaySet returns [EObject current=null] : ( ( (lv_dslSetValue_Days_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )* ) ;
    public final EObject ruleDaySet() throws RecognitionException {
        EObject current = null;

        Token lv_dslSetValue_Days_0_0=null;
        Token otherlv_1=null;
        Token lv_dslSetValue_Days_2_0=null;

         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6364:28: ( ( ( (lv_dslSetValue_Days_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6365:1: ( ( (lv_dslSetValue_Days_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6365:1: ( ( (lv_dslSetValue_Days_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6365:2: ( (lv_dslSetValue_Days_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6365:2: ( (lv_dslSetValue_Days_0_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6366:1: (lv_dslSetValue_Days_0_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6366:1: (lv_dslSetValue_Days_0_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6367:3: lv_dslSetValue_Days_0_0= RULE_INT
            {
            lv_dslSetValue_Days_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaySet15660); 

            			newLeafNode(lv_dslSetValue_Days_0_0, grammarAccess.getDaySetAccess().getDslSetValue_DaysINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDaySetRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"dslSetValue_Days",
                    		lv_dslSetValue_Days_0_0, 
                    		"INT");
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6383:2: (otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==137) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6383:4: otherlv_1= ',' ( (lv_dslSetValue_Days_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,137,FOLLOW_137_in_ruleDaySet15678); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDaySetAccess().getCommaKeyword_1_0());
            	        
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6387:1: ( (lv_dslSetValue_Days_2_0= RULE_INT ) )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6388:1: (lv_dslSetValue_Days_2_0= RULE_INT )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6388:1: (lv_dslSetValue_Days_2_0= RULE_INT )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6389:3: lv_dslSetValue_Days_2_0= RULE_INT
            	    {
            	    lv_dslSetValue_Days_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDaySet15695); 

            	    			newLeafNode(lv_dslSetValue_Days_2_0, grammarAccess.getDaySetAccess().getDslSetValue_DaysINTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDaySetRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"dslSetValue_Days",
            	            		lv_dslSetValue_Days_2_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDaySet"


    // $ANTLR start "entryRuleWhenModeOfWeek"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6413:1: entryRuleWhenModeOfWeek returns [EObject current=null] : iv_ruleWhenModeOfWeek= ruleWhenModeOfWeek EOF ;
    public final EObject entryRuleWhenModeOfWeek() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenModeOfWeek = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6414:2: (iv_ruleWhenModeOfWeek= ruleWhenModeOfWeek EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6415:2: iv_ruleWhenModeOfWeek= ruleWhenModeOfWeek EOF
            {
             newCompositeNode(grammarAccess.getWhenModeOfWeekRule()); 
            pushFollow(FOLLOW_ruleWhenModeOfWeek_in_entryRuleWhenModeOfWeek15738);
            iv_ruleWhenModeOfWeek=ruleWhenModeOfWeek();

            state._fsp--;

             current =iv_ruleWhenModeOfWeek; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenModeOfWeek15748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenModeOfWeek"


    // $ANTLR start "ruleWhenModeOfWeek"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6422:1: ruleWhenModeOfWeek returns [EObject current=null] : (otherlv_0= 'when-mode-of-week-is' ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+ ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenModeOfWeek() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenModeOfWeek_Cases_1_0 = null;

        EObject lv_dsl_WhenModeOfWeek_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6425:28: ( (otherlv_0= 'when-mode-of-week-is' ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+ ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6426:1: (otherlv_0= 'when-mode-of-week-is' ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+ ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6426:1: (otherlv_0= 'when-mode-of-week-is' ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+ ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6426:3: otherlv_0= 'when-mode-of-week-is' ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+ ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,146,FOLLOW_146_in_ruleWhenModeOfWeek15785); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenModeOfWeekAccess().getWhenModeOfWeekIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6430:1: ( (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase ) )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=158 && LA86_0<=165)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6431:1: (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6431:1: (lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6432:3: lv_dsl_WhenModeOfWeek_Cases_1_0= ruleWhenModeOfWeekCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenModeOfWeekAccess().getDsl_WhenModeOfWeek_CasesWhenModeOfWeekCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenModeOfWeekCase_in_ruleWhenModeOfWeek15806);
            	    lv_dsl_WhenModeOfWeek_Cases_1_0=ruleWhenModeOfWeekCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenModeOfWeekRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenModeOfWeek_Cases",
            	            		lv_dsl_WhenModeOfWeek_Cases_1_0, 
            	            		"WhenModeOfWeekCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6448:3: ( (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==145) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6449:1: (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6449:1: (lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6450:3: lv_dsl_WhenModeOfWeek_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenModeOfWeekAccess().getDsl_WhenModeOfWeek_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenModeOfWeek15828);
                    lv_dsl_WhenModeOfWeek_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenModeOfWeekRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenModeOfWeek_Other",
                            		lv_dsl_WhenModeOfWeek_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,134,FOLLOW_134_in_ruleWhenModeOfWeek15841); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenModeOfWeekAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenModeOfWeek"


    // $ANTLR start "entryRuleWhenModeOfWeekCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6478:1: entryRuleWhenModeOfWeekCase returns [EObject current=null] : iv_ruleWhenModeOfWeekCase= ruleWhenModeOfWeekCase EOF ;
    public final EObject entryRuleWhenModeOfWeekCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenModeOfWeekCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6479:2: (iv_ruleWhenModeOfWeekCase= ruleWhenModeOfWeekCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6480:2: iv_ruleWhenModeOfWeekCase= ruleWhenModeOfWeekCase EOF
            {
             newCompositeNode(grammarAccess.getWhenModeOfWeekCaseRule()); 
            pushFollow(FOLLOW_ruleWhenModeOfWeekCase_in_entryRuleWhenModeOfWeekCase15877);
            iv_ruleWhenModeOfWeekCase=ruleWhenModeOfWeekCase();

            state._fsp--;

             current =iv_ruleWhenModeOfWeekCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenModeOfWeekCase15887); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenModeOfWeekCase"


    // $ANTLR start "ruleWhenModeOfWeekCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6487:1: ruleWhenModeOfWeekCase returns [EObject current=null] : ( ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) ) otherlv_1= 'use:' ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenModeOfWeekCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dsl_WhenModeOfWeekCase_Days_0_0 = null;

        EObject lv_dsl_WhenModeOfWeekCase_True_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6490:28: ( ( ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) ) otherlv_1= 'use:' ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6491:1: ( ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) ) otherlv_1= 'use:' ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6491:1: ( ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) ) otherlv_1= 'use:' ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6491:2: ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) ) otherlv_1= 'use:' ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6491:2: ( (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6492:1: (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6492:1: (lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6493:3: lv_dsl_WhenModeOfWeekCase_Days_0_0= ruleModeOfWeekSet
            {
             
            	        newCompositeNode(grammarAccess.getWhenModeOfWeekCaseAccess().getDsl_WhenModeOfWeekCase_DaysModeOfWeekSetParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModeOfWeekSet_in_ruleWhenModeOfWeekCase15933);
            lv_dsl_WhenModeOfWeekCase_Days_0_0=ruleModeOfWeekSet();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenModeOfWeekCaseRule());
            	        }
                   		set(
                   			current, 
                   			"dsl_WhenModeOfWeekCase_Days",
                    		lv_dsl_WhenModeOfWeekCase_Days_0_0, 
                    		"ModeOfWeekSet");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,135,FOLLOW_135_in_ruleWhenModeOfWeekCase15945); 

                	newLeafNode(otherlv_1, grammarAccess.getWhenModeOfWeekCaseAccess().getUseKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6513:1: ( (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==47||LA88_0==58||LA88_0==67||LA88_0==87||(LA88_0>=89 && LA88_0<=90)||LA88_0==94||LA88_0==97||LA88_0==99||LA88_0==101||LA88_0==103||LA88_0==105||LA88_0==107||LA88_0==109||LA88_0==111||LA88_0==113||LA88_0==115||LA88_0==117||LA88_0==119||LA88_0==121||LA88_0==123||(LA88_0>=125 && LA88_0<=128)||(LA88_0>=132 && LA88_0<=133)||(LA88_0>=138 && LA88_0<=144)||(LA88_0>=146 && LA88_0<=148)) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6514:1: (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6514:1: (lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6515:3: lv_dsl_WhenModeOfWeekCase_True_actions_2_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenModeOfWeekCaseAccess().getDsl_WhenModeOfWeekCase_True_actionsAbstractComponentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenModeOfWeekCase15966);
            	    lv_dsl_WhenModeOfWeekCase_True_actions_2_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenModeOfWeekCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenModeOfWeekCase_True_actions",
            	            		lv_dsl_WhenModeOfWeekCase_True_actions_2_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenModeOfWeekCase"


    // $ANTLR start "entryRuleModeOfWeekSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6539:1: entryRuleModeOfWeekSet returns [EObject current=null] : iv_ruleModeOfWeekSet= ruleModeOfWeekSet EOF ;
    public final EObject entryRuleModeOfWeekSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeOfWeekSet = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6540:2: (iv_ruleModeOfWeekSet= ruleModeOfWeekSet EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6541:2: iv_ruleModeOfWeekSet= ruleModeOfWeekSet EOF
            {
             newCompositeNode(grammarAccess.getModeOfWeekSetRule()); 
            pushFollow(FOLLOW_ruleModeOfWeekSet_in_entryRuleModeOfWeekSet16003);
            iv_ruleModeOfWeekSet=ruleModeOfWeekSet();

            state._fsp--;

             current =iv_ruleModeOfWeekSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModeOfWeekSet16013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeOfWeekSet"


    // $ANTLR start "ruleModeOfWeekSet"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6548:1: ruleModeOfWeekSet returns [EObject current=null] : ( ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) ) (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )* ) ;
    public final EObject ruleModeOfWeekSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_dsl_ModeOfWeekSet_MOWs_0_0 = null;

        Enumerator lv_dsl_ModeOfWeekSet_MOWs_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6551:28: ( ( ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) ) (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6552:1: ( ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) ) (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6552:1: ( ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) ) (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6552:2: ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) ) (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6552:2: ( (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6553:1: (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6553:1: (lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6554:3: lv_dsl_ModeOfWeekSet_MOWs_0_0= ruleModeTypes
            {
             
            	        newCompositeNode(grammarAccess.getModeOfWeekSetAccess().getDsl_ModeOfWeekSet_MOWsModeTypesEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModeTypes_in_ruleModeOfWeekSet16059);
            lv_dsl_ModeOfWeekSet_MOWs_0_0=ruleModeTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModeOfWeekSetRule());
            	        }
                   		add(
                   			current, 
                   			"dsl_ModeOfWeekSet_MOWs",
                    		lv_dsl_ModeOfWeekSet_MOWs_0_0, 
                    		"ModeTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6570:2: (otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==137) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6570:4: otherlv_1= ',' ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) )
            	    {
            	    otherlv_1=(Token)match(input,137,FOLLOW_137_in_ruleModeOfWeekSet16072); 

            	        	newLeafNode(otherlv_1, grammarAccess.getModeOfWeekSetAccess().getCommaKeyword_1_0());
            	        
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6574:1: ( (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes ) )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6575:1: (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6575:1: (lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6576:3: lv_dsl_ModeOfWeekSet_MOWs_2_0= ruleModeTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModeOfWeekSetAccess().getDsl_ModeOfWeekSet_MOWsModeTypesEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModeTypes_in_ruleModeOfWeekSet16093);
            	    lv_dsl_ModeOfWeekSet_MOWs_2_0=ruleModeTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModeOfWeekSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_ModeOfWeekSet_MOWs",
            	            		lv_dsl_ModeOfWeekSet_MOWs_2_0, 
            	            		"ModeTypes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeOfWeekSet"


    // $ANTLR start "entryRuleWhenSundaysBeforeTriodion"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6600:1: entryRuleWhenSundaysBeforeTriodion returns [EObject current=null] : iv_ruleWhenSundaysBeforeTriodion= ruleWhenSundaysBeforeTriodion EOF ;
    public final EObject entryRuleWhenSundaysBeforeTriodion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenSundaysBeforeTriodion = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6601:2: (iv_ruleWhenSundaysBeforeTriodion= ruleWhenSundaysBeforeTriodion EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6602:2: iv_ruleWhenSundaysBeforeTriodion= ruleWhenSundaysBeforeTriodion EOF
            {
             newCompositeNode(grammarAccess.getWhenSundaysBeforeTriodionRule()); 
            pushFollow(FOLLOW_ruleWhenSundaysBeforeTriodion_in_entryRuleWhenSundaysBeforeTriodion16131);
            iv_ruleWhenSundaysBeforeTriodion=ruleWhenSundaysBeforeTriodion();

            state._fsp--;

             current =iv_ruleWhenSundaysBeforeTriodion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenSundaysBeforeTriodion16141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenSundaysBeforeTriodion"


    // $ANTLR start "ruleWhenSundaysBeforeTriodion"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6609:1: ruleWhenSundaysBeforeTriodion returns [EObject current=null] : (otherlv_0= 'when-sundays-before-triodion-is' ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+ ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenSundaysBeforeTriodion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0 = null;

        EObject lv_dsl_SundaysBeforeTriodion_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6612:28: ( (otherlv_0= 'when-sundays-before-triodion-is' ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+ ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6613:1: (otherlv_0= 'when-sundays-before-triodion-is' ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+ ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6613:1: (otherlv_0= 'when-sundays-before-triodion-is' ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+ ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6613:3: otherlv_0= 'when-sundays-before-triodion-is' ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+ ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,147,FOLLOW_147_in_ruleWhenSundaysBeforeTriodion16178); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenSundaysBeforeTriodionAccess().getWhenSundaysBeforeTriodionIsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6617:1: ( (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase ) )+
            int cnt90=0;
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==RULE_INT) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6618:1: (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6618:1: (lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6619:3: lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0= ruleSundaysBeforeTriodionCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenSundaysBeforeTriodionAccess().getDsl_WhenSundaysBeforeTriodion_CasesSundaysBeforeTriodionCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSundaysBeforeTriodionCase_in_ruleWhenSundaysBeforeTriodion16199);
            	    lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0=ruleSundaysBeforeTriodionCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenSundaysBeforeTriodionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenSundaysBeforeTriodion_Cases",
            	            		lv_dsl_WhenSundaysBeforeTriodion_Cases_1_0, 
            	            		"SundaysBeforeTriodionCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt90 >= 1 ) break loop90;
                        EarlyExitException eee =
                            new EarlyExitException(90, input);
                        throw eee;
                }
                cnt90++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6635:3: ( (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==145) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6636:1: (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6636:1: (lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6637:3: lv_dsl_SundaysBeforeTriodion_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenSundaysBeforeTriodionAccess().getDsl_SundaysBeforeTriodion_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenSundaysBeforeTriodion16221);
                    lv_dsl_SundaysBeforeTriodion_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenSundaysBeforeTriodionRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_SundaysBeforeTriodion_Other",
                            		lv_dsl_SundaysBeforeTriodion_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,134,FOLLOW_134_in_ruleWhenSundaysBeforeTriodion16234); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenSundaysBeforeTriodionAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenSundaysBeforeTriodion"


    // $ANTLR start "entryRuleSundaysBeforeTriodionCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6665:1: entryRuleSundaysBeforeTriodionCase returns [EObject current=null] : iv_ruleSundaysBeforeTriodionCase= ruleSundaysBeforeTriodionCase EOF ;
    public final EObject entryRuleSundaysBeforeTriodionCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSundaysBeforeTriodionCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6666:2: (iv_ruleSundaysBeforeTriodionCase= ruleSundaysBeforeTriodionCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6667:2: iv_ruleSundaysBeforeTriodionCase= ruleSundaysBeforeTriodionCase EOF
            {
             newCompositeNode(grammarAccess.getSundaysBeforeTriodionCaseRule()); 
            pushFollow(FOLLOW_ruleSundaysBeforeTriodionCase_in_entryRuleSundaysBeforeTriodionCase16270);
            iv_ruleSundaysBeforeTriodionCase=ruleSundaysBeforeTriodionCase();

            state._fsp--;

             current =iv_ruleSundaysBeforeTriodionCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSundaysBeforeTriodionCase16280); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSundaysBeforeTriodionCase"


    // $ANTLR start "ruleSundaysBeforeTriodionCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6674:1: ruleSundaysBeforeTriodionCase returns [EObject current=null] : ( ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) ) otherlv_1= 'use:' ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleSundaysBeforeTriodionCase() throws RecognitionException {
        EObject current = null;

        Token lv_dsl_SundaysBeforeTriodionCase_Days_0_0=null;
        Token otherlv_1=null;
        EObject lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6677:28: ( ( ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) ) otherlv_1= 'use:' ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6678:1: ( ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) ) otherlv_1= 'use:' ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6678:1: ( ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) ) otherlv_1= 'use:' ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6678:2: ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) ) otherlv_1= 'use:' ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )*
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6678:2: ( (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6679:1: (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6679:1: (lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6680:3: lv_dsl_SundaysBeforeTriodionCase_Days_0_0= RULE_INT
            {
            lv_dsl_SundaysBeforeTriodionCase_Days_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSundaysBeforeTriodionCase16322); 

            			newLeafNode(lv_dsl_SundaysBeforeTriodionCase_Days_0_0, grammarAccess.getSundaysBeforeTriodionCaseAccess().getDsl_SundaysBeforeTriodionCase_DaysINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSundaysBeforeTriodionCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"dsl_SundaysBeforeTriodionCase_Days",
                    		lv_dsl_SundaysBeforeTriodionCase_Days_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,135,FOLLOW_135_in_ruleSundaysBeforeTriodionCase16339); 

                	newLeafNode(otherlv_1, grammarAccess.getSundaysBeforeTriodionCaseAccess().getUseKeyword_1());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6700:1: ( (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==47||LA92_0==58||LA92_0==67||LA92_0==87||(LA92_0>=89 && LA92_0<=90)||LA92_0==94||LA92_0==97||LA92_0==99||LA92_0==101||LA92_0==103||LA92_0==105||LA92_0==107||LA92_0==109||LA92_0==111||LA92_0==113||LA92_0==115||LA92_0==117||LA92_0==119||LA92_0==121||LA92_0==123||(LA92_0>=125 && LA92_0<=128)||(LA92_0>=132 && LA92_0<=133)||(LA92_0>=138 && LA92_0<=144)||(LA92_0>=146 && LA92_0<=148)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6701:1: (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6701:1: (lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6702:3: lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSundaysBeforeTriodionCaseAccess().getDsl_SundaysBeforeTriodionCase_True_actionsAbstractComponentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleSundaysBeforeTriodionCase16360);
            	    lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSundaysBeforeTriodionCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_SundaysBeforeTriodionCase_True_actions",
            	            		lv_dsl_SundaysBeforeTriodionCase_True_actions_2_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSundaysBeforeTriodionCase"


    // $ANTLR start "entryRuleWhenExists"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6726:1: entryRuleWhenExists returns [EObject current=null] : iv_ruleWhenExists= ruleWhenExists EOF ;
    public final EObject entryRuleWhenExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenExists = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6727:2: (iv_ruleWhenExists= ruleWhenExists EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6728:2: iv_ruleWhenExists= ruleWhenExists EOF
            {
             newCompositeNode(grammarAccess.getWhenExistsRule()); 
            pushFollow(FOLLOW_ruleWhenExists_in_entryRuleWhenExists16397);
            iv_ruleWhenExists=ruleWhenExists();

            state._fsp--;

             current =iv_ruleWhenExists; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenExists16407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenExists"


    // $ANTLR start "ruleWhenExists"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6735:1: ruleWhenExists returns [EObject current=null] : (otherlv_0= 'when-exists' ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+ ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) ;
    public final EObject ruleWhenExists() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_dsl_WhenExists_Cases_1_0 = null;

        EObject lv_dsl_WhenExists_Other_2_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6738:28: ( (otherlv_0= 'when-exists' ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+ ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6739:1: (otherlv_0= 'when-exists' ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+ ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6739:1: (otherlv_0= 'when-exists' ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+ ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when' )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6739:3: otherlv_0= 'when-exists' ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+ ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )? otherlv_3= 'end-when'
            {
            otherlv_0=(Token)match(input,148,FOLLOW_148_in_ruleWhenExists16444); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenExistsAccess().getWhenExistsKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6743:1: ( (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase ) )+
            int cnt93=0;
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==51) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6744:1: (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6744:1: (lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6745:3: lv_dsl_WhenExists_Cases_1_0= ruleWhenExistsCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenExistsAccess().getDsl_WhenExists_CasesWhenExistsCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWhenExistsCase_in_ruleWhenExists16465);
            	    lv_dsl_WhenExists_Cases_1_0=ruleWhenExistsCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenExistsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenExists_Cases",
            	            		lv_dsl_WhenExists_Cases_1_0, 
            	            		"WhenExistsCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt93 >= 1 ) break loop93;
                        EarlyExitException eee =
                            new EarlyExitException(93, input);
                        throw eee;
                }
                cnt93++;
            } while (true);

            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6761:3: ( (lv_dsl_WhenExists_Other_2_0= ruleWhenOther ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==145) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6762:1: (lv_dsl_WhenExists_Other_2_0= ruleWhenOther )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6762:1: (lv_dsl_WhenExists_Other_2_0= ruleWhenOther )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6763:3: lv_dsl_WhenExists_Other_2_0= ruleWhenOther
                    {
                     
                    	        newCompositeNode(grammarAccess.getWhenExistsAccess().getDsl_WhenExists_OtherWhenOtherParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWhenOther_in_ruleWhenExists16487);
                    lv_dsl_WhenExists_Other_2_0=ruleWhenOther();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWhenExistsRule());
                    	        }
                           		set(
                           			current, 
                           			"dsl_WhenExists_Other",
                            		lv_dsl_WhenExists_Other_2_0, 
                            		"WhenOther");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,134,FOLLOW_134_in_ruleWhenExists16500); 

                	newLeafNode(otherlv_3, grammarAccess.getWhenExistsAccess().getEndWhenKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenExists"


    // $ANTLR start "entryRuleWhenExistsCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6791:1: entryRuleWhenExistsCase returns [EObject current=null] : iv_ruleWhenExistsCase= ruleWhenExistsCase EOF ;
    public final EObject entryRuleWhenExistsCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenExistsCase = null;


        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6792:2: (iv_ruleWhenExistsCase= ruleWhenExistsCase EOF )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6793:2: iv_ruleWhenExistsCase= ruleWhenExistsCase EOF
            {
             newCompositeNode(grammarAccess.getWhenExistsCaseRule()); 
            pushFollow(FOLLOW_ruleWhenExistsCase_in_entryRuleWhenExistsCase16536);
            iv_ruleWhenExistsCase=ruleWhenExistsCase();

            state._fsp--;

             current =iv_ruleWhenExistsCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenExistsCase16546); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhenExistsCase"


    // $ANTLR start "ruleWhenExistsCase"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6800:1: ruleWhenExistsCase returns [EObject current=null] : (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) otherlv_2= 'use:' ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )* ) ;
    public final EObject ruleWhenExistsCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_dsl_WhenExistsCase_True_actions_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6803:28: ( (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) otherlv_2= 'use:' ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )* ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6804:1: (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) otherlv_2= 'use:' ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )* )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6804:1: (otherlv_0= 'rid' ( ( ruleQualifiedName ) ) otherlv_2= 'use:' ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )* )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6804:3: otherlv_0= 'rid' ( ( ruleQualifiedName ) ) otherlv_2= 'use:' ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )*
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleWhenExistsCase16583); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenExistsCaseAccess().getRidKeyword_0());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6808:1: ( ( ruleQualifiedName ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6809:1: ( ruleQualifiedName )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6809:1: ( ruleQualifiedName )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6810:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWhenExistsCaseRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getWhenExistsCaseAccess().getDsl_WhenExistsCase_RefDefinitionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleWhenExistsCase16606);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,135,FOLLOW_135_in_ruleWhenExistsCase16618); 

                	newLeafNode(otherlv_2, grammarAccess.getWhenExistsCaseAccess().getUseKeyword_2());
                
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6827:1: ( (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==47||LA95_0==58||LA95_0==67||LA95_0==87||(LA95_0>=89 && LA95_0<=90)||LA95_0==94||LA95_0==97||LA95_0==99||LA95_0==101||LA95_0==103||LA95_0==105||LA95_0==107||LA95_0==109||LA95_0==111||LA95_0==113||LA95_0==115||LA95_0==117||LA95_0==119||LA95_0==121||LA95_0==123||(LA95_0>=125 && LA95_0<=128)||(LA95_0>=132 && LA95_0<=133)||(LA95_0>=138 && LA95_0<=144)||(LA95_0>=146 && LA95_0<=148)) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6828:1: (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent )
            	    {
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6828:1: (lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent )
            	    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6829:3: lv_dsl_WhenExistsCase_True_actions_3_0= ruleAbstractComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWhenExistsCaseAccess().getDsl_WhenExistsCase_True_actionsAbstractComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractComponent_in_ruleWhenExistsCase16639);
            	    lv_dsl_WhenExistsCase_True_actions_3_0=ruleAbstractComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWhenExistsCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dsl_WhenExistsCase_True_actions",
            	            		lv_dsl_WhenExistsCase_True_actions_3_0, 
            	            		"AbstractComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhenExistsCase"


    // $ANTLR start "ruleVersionSwitchType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6853:1: ruleVersionSwitchType returns [Enumerator current=null] : ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) | (enumLiteral_2= 'Both' ) ) ;
    public final Enumerator ruleVersionSwitchType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6855:28: ( ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) | (enumLiteral_2= 'Both' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6856:1: ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) | (enumLiteral_2= 'Both' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6856:1: ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) | (enumLiteral_2= 'Both' ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case 149:
                {
                alt96=1;
                }
                break;
            case 150:
                {
                alt96=2;
                }
                break;
            case 151:
                {
                alt96=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6856:2: (enumLiteral_0= 'L1' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6856:2: (enumLiteral_0= 'L1' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6856:4: enumLiteral_0= 'L1'
                    {
                    enumLiteral_0=(Token)match(input,149,FOLLOW_149_in_ruleVersionSwitchType16690); 

                            current = grammarAccess.getVersionSwitchTypeAccess().getL1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVersionSwitchTypeAccess().getL1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6862:6: (enumLiteral_1= 'L2' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6862:6: (enumLiteral_1= 'L2' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6862:8: enumLiteral_1= 'L2'
                    {
                    enumLiteral_1=(Token)match(input,150,FOLLOW_150_in_ruleVersionSwitchType16707); 

                            current = grammarAccess.getVersionSwitchTypeAccess().getL2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVersionSwitchTypeAccess().getL2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6868:6: (enumLiteral_2= 'Both' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6868:6: (enumLiteral_2= 'Both' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6868:8: enumLiteral_2= 'Both'
                    {
                    enumLiteral_2=(Token)match(input,151,FOLLOW_151_in_ruleVersionSwitchType16724); 

                            current = grammarAccess.getVersionSwitchTypeAccess().getBothEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVersionSwitchTypeAccess().getBothEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionSwitchType"


    // $ANTLR start "ruleLanguage"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6878:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6880:28: ( ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6881:1: ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6881:1: ( (enumLiteral_0= 'L1' ) | (enumLiteral_1= 'L2' ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==149) ) {
                alt97=1;
            }
            else if ( (LA97_0==150) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6881:2: (enumLiteral_0= 'L1' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6881:2: (enumLiteral_0= 'L1' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6881:4: enumLiteral_0= 'L1'
                    {
                    enumLiteral_0=(Token)match(input,149,FOLLOW_149_in_ruleLanguage16769); 

                            current = grammarAccess.getLanguageAccess().getL1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getL1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6887:6: (enumLiteral_1= 'L2' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6887:6: (enumLiteral_1= 'L2' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6887:8: enumLiteral_1= 'L2'
                    {
                    enumLiteral_1=(Token)match(input,150,FOLLOW_150_in_ruleLanguage16786); 

                            current = grammarAccess.getLanguageAccess().getL2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getL2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "ruleBreakType"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6897:1: ruleBreakType returns [Enumerator current=null] : ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'page' ) ) ;
    public final Enumerator ruleBreakType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6899:28: ( ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'page' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6900:1: ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'page' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6900:1: ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'page' ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==152) ) {
                alt98=1;
            }
            else if ( (LA98_0==153) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6900:2: (enumLiteral_0= 'line' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6900:2: (enumLiteral_0= 'line' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6900:4: enumLiteral_0= 'line'
                    {
                    enumLiteral_0=(Token)match(input,152,FOLLOW_152_in_ruleBreakType16831); 

                            current = grammarAccess.getBreakTypeAccess().getLineEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBreakTypeAccess().getLineEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6906:6: (enumLiteral_1= 'page' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6906:6: (enumLiteral_1= 'page' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6906:8: enumLiteral_1= 'page'
                    {
                    enumLiteral_1=(Token)match(input,153,FOLLOW_153_in_ruleBreakType16848); 

                            current = grammarAccess.getBreakTypeAccess().getPageEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBreakTypeAccess().getPageEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreakType"


    // $ANTLR start "ruleTemplateStatuses"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6916:1: ruleTemplateStatuses returns [Enumerator current=null] : ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'Draft' ) | (enumLiteral_2= 'Review' ) | (enumLiteral_3= 'Final' ) ) ;
    public final Enumerator ruleTemplateStatuses() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6918:28: ( ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'Draft' ) | (enumLiteral_2= 'Review' ) | (enumLiteral_3= 'Final' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6919:1: ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'Draft' ) | (enumLiteral_2= 'Review' ) | (enumLiteral_3= 'Final' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6919:1: ( (enumLiteral_0= 'NA' ) | (enumLiteral_1= 'Draft' ) | (enumLiteral_2= 'Review' ) | (enumLiteral_3= 'Final' ) )
            int alt99=4;
            switch ( input.LA(1) ) {
            case 154:
                {
                alt99=1;
                }
                break;
            case 155:
                {
                alt99=2;
                }
                break;
            case 156:
                {
                alt99=3;
                }
                break;
            case 157:
                {
                alt99=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6919:2: (enumLiteral_0= 'NA' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6919:2: (enumLiteral_0= 'NA' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6919:4: enumLiteral_0= 'NA'
                    {
                    enumLiteral_0=(Token)match(input,154,FOLLOW_154_in_ruleTemplateStatuses16893); 

                            current = grammarAccess.getTemplateStatusesAccess().getNAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTemplateStatusesAccess().getNAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6925:6: (enumLiteral_1= 'Draft' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6925:6: (enumLiteral_1= 'Draft' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6925:8: enumLiteral_1= 'Draft'
                    {
                    enumLiteral_1=(Token)match(input,155,FOLLOW_155_in_ruleTemplateStatuses16910); 

                            current = grammarAccess.getTemplateStatusesAccess().getDraftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTemplateStatusesAccess().getDraftEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6931:6: (enumLiteral_2= 'Review' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6931:6: (enumLiteral_2= 'Review' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6931:8: enumLiteral_2= 'Review'
                    {
                    enumLiteral_2=(Token)match(input,156,FOLLOW_156_in_ruleTemplateStatuses16927); 

                            current = grammarAccess.getTemplateStatusesAccess().getReviewEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTemplateStatusesAccess().getReviewEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6937:6: (enumLiteral_3= 'Final' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6937:6: (enumLiteral_3= 'Final' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6937:8: enumLiteral_3= 'Final'
                    {
                    enumLiteral_3=(Token)match(input,157,FOLLOW_157_in_ruleTemplateStatuses16944); 

                            current = grammarAccess.getTemplateStatusesAccess().getFinalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTemplateStatusesAccess().getFinalEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateStatuses"


    // $ANTLR start "ruleModeTypes"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6949:1: ruleModeTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M7' ) | (enumLiteral_7= 'M8' ) ) ;
    public final Enumerator ruleModeTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6951:28: ( ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M7' ) | (enumLiteral_7= 'M8' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6952:1: ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M7' ) | (enumLiteral_7= 'M8' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6952:1: ( (enumLiteral_0= 'M1' ) | (enumLiteral_1= 'M2' ) | (enumLiteral_2= 'M3' ) | (enumLiteral_3= 'M4' ) | (enumLiteral_4= 'M5' ) | (enumLiteral_5= 'M6' ) | (enumLiteral_6= 'M7' ) | (enumLiteral_7= 'M8' ) )
            int alt100=8;
            switch ( input.LA(1) ) {
            case 158:
                {
                alt100=1;
                }
                break;
            case 159:
                {
                alt100=2;
                }
                break;
            case 160:
                {
                alt100=3;
                }
                break;
            case 161:
                {
                alt100=4;
                }
                break;
            case 162:
                {
                alt100=5;
                }
                break;
            case 163:
                {
                alt100=6;
                }
                break;
            case 164:
                {
                alt100=7;
                }
                break;
            case 165:
                {
                alt100=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6952:2: (enumLiteral_0= 'M1' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6952:2: (enumLiteral_0= 'M1' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6952:4: enumLiteral_0= 'M1'
                    {
                    enumLiteral_0=(Token)match(input,158,FOLLOW_158_in_ruleModeTypes16991); 

                            current = grammarAccess.getModeTypesAccess().getM1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getModeTypesAccess().getM1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6958:6: (enumLiteral_1= 'M2' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6958:6: (enumLiteral_1= 'M2' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6958:8: enumLiteral_1= 'M2'
                    {
                    enumLiteral_1=(Token)match(input,159,FOLLOW_159_in_ruleModeTypes17008); 

                            current = grammarAccess.getModeTypesAccess().getM2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getModeTypesAccess().getM2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6964:6: (enumLiteral_2= 'M3' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6964:6: (enumLiteral_2= 'M3' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6964:8: enumLiteral_2= 'M3'
                    {
                    enumLiteral_2=(Token)match(input,160,FOLLOW_160_in_ruleModeTypes17025); 

                            current = grammarAccess.getModeTypesAccess().getM3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getModeTypesAccess().getM3EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6970:6: (enumLiteral_3= 'M4' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6970:6: (enumLiteral_3= 'M4' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6970:8: enumLiteral_3= 'M4'
                    {
                    enumLiteral_3=(Token)match(input,161,FOLLOW_161_in_ruleModeTypes17042); 

                            current = grammarAccess.getModeTypesAccess().getM4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getModeTypesAccess().getM4EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6976:6: (enumLiteral_4= 'M5' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6976:6: (enumLiteral_4= 'M5' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6976:8: enumLiteral_4= 'M5'
                    {
                    enumLiteral_4=(Token)match(input,162,FOLLOW_162_in_ruleModeTypes17059); 

                            current = grammarAccess.getModeTypesAccess().getM5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getModeTypesAccess().getM5EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6982:6: (enumLiteral_5= 'M6' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6982:6: (enumLiteral_5= 'M6' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6982:8: enumLiteral_5= 'M6'
                    {
                    enumLiteral_5=(Token)match(input,163,FOLLOW_163_in_ruleModeTypes17076); 

                            current = grammarAccess.getModeTypesAccess().getM6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getModeTypesAccess().getM6EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6988:6: (enumLiteral_6= 'M7' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6988:6: (enumLiteral_6= 'M7' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6988:8: enumLiteral_6= 'M7'
                    {
                    enumLiteral_6=(Token)match(input,164,FOLLOW_164_in_ruleModeTypes17093); 

                            current = grammarAccess.getModeTypesAccess().getM7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getModeTypesAccess().getM7EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6994:6: (enumLiteral_7= 'M8' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6994:6: (enumLiteral_7= 'M8' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:6994:8: enumLiteral_7= 'M8'
                    {
                    enumLiteral_7=(Token)match(input,165,FOLLOW_165_in_ruleModeTypes17110); 

                            current = grammarAccess.getModeTypesAccess().getM8EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getModeTypesAccess().getM8EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeTypes"


    // $ANTLR start "ruleDowTypes"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7004:1: ruleDowTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'D1' ) | (enumLiteral_1= 'D2' ) | (enumLiteral_2= 'D3' ) | (enumLiteral_3= 'D4' ) | (enumLiteral_4= 'D5' ) | (enumLiteral_5= 'D6' ) | (enumLiteral_6= 'D7' ) ) ;
    public final Enumerator ruleDowTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7006:28: ( ( (enumLiteral_0= 'D1' ) | (enumLiteral_1= 'D2' ) | (enumLiteral_2= 'D3' ) | (enumLiteral_3= 'D4' ) | (enumLiteral_4= 'D5' ) | (enumLiteral_5= 'D6' ) | (enumLiteral_6= 'D7' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7007:1: ( (enumLiteral_0= 'D1' ) | (enumLiteral_1= 'D2' ) | (enumLiteral_2= 'D3' ) | (enumLiteral_3= 'D4' ) | (enumLiteral_4= 'D5' ) | (enumLiteral_5= 'D6' ) | (enumLiteral_6= 'D7' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7007:1: ( (enumLiteral_0= 'D1' ) | (enumLiteral_1= 'D2' ) | (enumLiteral_2= 'D3' ) | (enumLiteral_3= 'D4' ) | (enumLiteral_4= 'D5' ) | (enumLiteral_5= 'D6' ) | (enumLiteral_6= 'D7' ) )
            int alt101=7;
            switch ( input.LA(1) ) {
            case 166:
                {
                alt101=1;
                }
                break;
            case 167:
                {
                alt101=2;
                }
                break;
            case 168:
                {
                alt101=3;
                }
                break;
            case 169:
                {
                alt101=4;
                }
                break;
            case 170:
                {
                alt101=5;
                }
                break;
            case 171:
                {
                alt101=6;
                }
                break;
            case 172:
                {
                alt101=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7007:2: (enumLiteral_0= 'D1' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7007:2: (enumLiteral_0= 'D1' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7007:4: enumLiteral_0= 'D1'
                    {
                    enumLiteral_0=(Token)match(input,166,FOLLOW_166_in_ruleDowTypes17155); 

                            current = grammarAccess.getDowTypesAccess().getD1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDowTypesAccess().getD1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7013:6: (enumLiteral_1= 'D2' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7013:6: (enumLiteral_1= 'D2' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7013:8: enumLiteral_1= 'D2'
                    {
                    enumLiteral_1=(Token)match(input,167,FOLLOW_167_in_ruleDowTypes17172); 

                            current = grammarAccess.getDowTypesAccess().getD2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDowTypesAccess().getD2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7019:6: (enumLiteral_2= 'D3' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7019:6: (enumLiteral_2= 'D3' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7019:8: enumLiteral_2= 'D3'
                    {
                    enumLiteral_2=(Token)match(input,168,FOLLOW_168_in_ruleDowTypes17189); 

                            current = grammarAccess.getDowTypesAccess().getD3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDowTypesAccess().getD3EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7025:6: (enumLiteral_3= 'D4' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7025:6: (enumLiteral_3= 'D4' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7025:8: enumLiteral_3= 'D4'
                    {
                    enumLiteral_3=(Token)match(input,169,FOLLOW_169_in_ruleDowTypes17206); 

                            current = grammarAccess.getDowTypesAccess().getD4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDowTypesAccess().getD4EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7031:6: (enumLiteral_4= 'D5' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7031:6: (enumLiteral_4= 'D5' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7031:8: enumLiteral_4= 'D5'
                    {
                    enumLiteral_4=(Token)match(input,170,FOLLOW_170_in_ruleDowTypes17223); 

                            current = grammarAccess.getDowTypesAccess().getD5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDowTypesAccess().getD5EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7037:6: (enumLiteral_5= 'D6' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7037:6: (enumLiteral_5= 'D6' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7037:8: enumLiteral_5= 'D6'
                    {
                    enumLiteral_5=(Token)match(input,171,FOLLOW_171_in_ruleDowTypes17240); 

                            current = grammarAccess.getDowTypesAccess().getD6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDowTypesAccess().getD6EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7043:6: (enumLiteral_6= 'D7' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7043:6: (enumLiteral_6= 'D7' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7043:8: enumLiteral_6= 'D7'
                    {
                    enumLiteral_6=(Token)match(input,172,FOLLOW_172_in_ruleDowTypes17257); 

                            current = grammarAccess.getDowTypesAccess().getD7EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDowTypesAccess().getD7EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDowTypes"


    // $ANTLR start "ruleDayOfWeek"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7061:1: ruleDayOfWeek returns [Enumerator current=null] : ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) ;
    public final Enumerator ruleDayOfWeek() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7063:28: ( ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7064:1: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7064:1: ( (enumLiteral_0= 'Sunday' ) | (enumLiteral_1= 'Monday' ) | (enumLiteral_2= 'Tuesday' ) | (enumLiteral_3= 'Wednesday' ) | (enumLiteral_4= 'Thursday' ) | (enumLiteral_5= 'Friday' ) | (enumLiteral_6= 'Saturday' ) )
            int alt102=7;
            switch ( input.LA(1) ) {
            case 173:
                {
                alt102=1;
                }
                break;
            case 174:
                {
                alt102=2;
                }
                break;
            case 175:
                {
                alt102=3;
                }
                break;
            case 176:
                {
                alt102=4;
                }
                break;
            case 177:
                {
                alt102=5;
                }
                break;
            case 178:
                {
                alt102=6;
                }
                break;
            case 179:
                {
                alt102=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7064:2: (enumLiteral_0= 'Sunday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7064:2: (enumLiteral_0= 'Sunday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7064:4: enumLiteral_0= 'Sunday'
                    {
                    enumLiteral_0=(Token)match(input,173,FOLLOW_173_in_ruleDayOfWeek17310); 

                            current = grammarAccess.getDayOfWeekAccess().getSundayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDayOfWeekAccess().getSundayEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7070:6: (enumLiteral_1= 'Monday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7070:6: (enumLiteral_1= 'Monday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7070:8: enumLiteral_1= 'Monday'
                    {
                    enumLiteral_1=(Token)match(input,174,FOLLOW_174_in_ruleDayOfWeek17327); 

                            current = grammarAccess.getDayOfWeekAccess().getMondayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDayOfWeekAccess().getMondayEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7076:6: (enumLiteral_2= 'Tuesday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7076:6: (enumLiteral_2= 'Tuesday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7076:8: enumLiteral_2= 'Tuesday'
                    {
                    enumLiteral_2=(Token)match(input,175,FOLLOW_175_in_ruleDayOfWeek17344); 

                            current = grammarAccess.getDayOfWeekAccess().getTuesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDayOfWeekAccess().getTuesdayEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7082:6: (enumLiteral_3= 'Wednesday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7082:6: (enumLiteral_3= 'Wednesday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7082:8: enumLiteral_3= 'Wednesday'
                    {
                    enumLiteral_3=(Token)match(input,176,FOLLOW_176_in_ruleDayOfWeek17361); 

                            current = grammarAccess.getDayOfWeekAccess().getWednesdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDayOfWeekAccess().getWednesdayEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7088:6: (enumLiteral_4= 'Thursday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7088:6: (enumLiteral_4= 'Thursday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7088:8: enumLiteral_4= 'Thursday'
                    {
                    enumLiteral_4=(Token)match(input,177,FOLLOW_177_in_ruleDayOfWeek17378); 

                            current = grammarAccess.getDayOfWeekAccess().getThursdayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDayOfWeekAccess().getThursdayEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7094:6: (enumLiteral_5= 'Friday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7094:6: (enumLiteral_5= 'Friday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7094:8: enumLiteral_5= 'Friday'
                    {
                    enumLiteral_5=(Token)match(input,178,FOLLOW_178_in_ruleDayOfWeek17395); 

                            current = grammarAccess.getDayOfWeekAccess().getFridayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDayOfWeekAccess().getFridayEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7100:6: (enumLiteral_6= 'Saturday' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7100:6: (enumLiteral_6= 'Saturday' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7100:8: enumLiteral_6= 'Saturday'
                    {
                    enumLiteral_6=(Token)match(input,179,FOLLOW_179_in_ruleDayOfWeek17412); 

                            current = grammarAccess.getDayOfWeekAccess().getSaturdayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDayOfWeekAccess().getSaturdayEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDayOfWeek"


    // $ANTLR start "ruleMonthName"
    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7110:1: ruleMonthName returns [Enumerator current=null] : ( (enumLiteral_0= 'Jan' ) | (enumLiteral_1= 'Feb' ) | (enumLiteral_2= 'Mar' ) | (enumLiteral_3= 'Apr' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'Jun' ) | (enumLiteral_6= 'Jul' ) | (enumLiteral_7= 'Aug' ) | (enumLiteral_8= 'Sep' ) | (enumLiteral_9= 'Oct' ) | (enumLiteral_10= 'Nov' ) | (enumLiteral_11= 'Dec' ) ) ;
    public final Enumerator ruleMonthName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7112:28: ( ( (enumLiteral_0= 'Jan' ) | (enumLiteral_1= 'Feb' ) | (enumLiteral_2= 'Mar' ) | (enumLiteral_3= 'Apr' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'Jun' ) | (enumLiteral_6= 'Jul' ) | (enumLiteral_7= 'Aug' ) | (enumLiteral_8= 'Sep' ) | (enumLiteral_9= 'Oct' ) | (enumLiteral_10= 'Nov' ) | (enumLiteral_11= 'Dec' ) ) )
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7113:1: ( (enumLiteral_0= 'Jan' ) | (enumLiteral_1= 'Feb' ) | (enumLiteral_2= 'Mar' ) | (enumLiteral_3= 'Apr' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'Jun' ) | (enumLiteral_6= 'Jul' ) | (enumLiteral_7= 'Aug' ) | (enumLiteral_8= 'Sep' ) | (enumLiteral_9= 'Oct' ) | (enumLiteral_10= 'Nov' ) | (enumLiteral_11= 'Dec' ) )
            {
            // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7113:1: ( (enumLiteral_0= 'Jan' ) | (enumLiteral_1= 'Feb' ) | (enumLiteral_2= 'Mar' ) | (enumLiteral_3= 'Apr' ) | (enumLiteral_4= 'May' ) | (enumLiteral_5= 'Jun' ) | (enumLiteral_6= 'Jul' ) | (enumLiteral_7= 'Aug' ) | (enumLiteral_8= 'Sep' ) | (enumLiteral_9= 'Oct' ) | (enumLiteral_10= 'Nov' ) | (enumLiteral_11= 'Dec' ) )
            int alt103=12;
            switch ( input.LA(1) ) {
            case 180:
                {
                alt103=1;
                }
                break;
            case 181:
                {
                alt103=2;
                }
                break;
            case 182:
                {
                alt103=3;
                }
                break;
            case 183:
                {
                alt103=4;
                }
                break;
            case 184:
                {
                alt103=5;
                }
                break;
            case 185:
                {
                alt103=6;
                }
                break;
            case 186:
                {
                alt103=7;
                }
                break;
            case 187:
                {
                alt103=8;
                }
                break;
            case 188:
                {
                alt103=9;
                }
                break;
            case 189:
                {
                alt103=10;
                }
                break;
            case 190:
                {
                alt103=11;
                }
                break;
            case 191:
                {
                alt103=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7113:2: (enumLiteral_0= 'Jan' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7113:2: (enumLiteral_0= 'Jan' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7113:4: enumLiteral_0= 'Jan'
                    {
                    enumLiteral_0=(Token)match(input,180,FOLLOW_180_in_ruleMonthName17457); 

                            current = grammarAccess.getMonthNameAccess().getJanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMonthNameAccess().getJanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7119:6: (enumLiteral_1= 'Feb' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7119:6: (enumLiteral_1= 'Feb' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7119:8: enumLiteral_1= 'Feb'
                    {
                    enumLiteral_1=(Token)match(input,181,FOLLOW_181_in_ruleMonthName17474); 

                            current = grammarAccess.getMonthNameAccess().getFebEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMonthNameAccess().getFebEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7125:6: (enumLiteral_2= 'Mar' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7125:6: (enumLiteral_2= 'Mar' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7125:8: enumLiteral_2= 'Mar'
                    {
                    enumLiteral_2=(Token)match(input,182,FOLLOW_182_in_ruleMonthName17491); 

                            current = grammarAccess.getMonthNameAccess().getMarEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMonthNameAccess().getMarEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7131:6: (enumLiteral_3= 'Apr' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7131:6: (enumLiteral_3= 'Apr' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7131:8: enumLiteral_3= 'Apr'
                    {
                    enumLiteral_3=(Token)match(input,183,FOLLOW_183_in_ruleMonthName17508); 

                            current = grammarAccess.getMonthNameAccess().getAprEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMonthNameAccess().getAprEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7137:6: (enumLiteral_4= 'May' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7137:6: (enumLiteral_4= 'May' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7137:8: enumLiteral_4= 'May'
                    {
                    enumLiteral_4=(Token)match(input,184,FOLLOW_184_in_ruleMonthName17525); 

                            current = grammarAccess.getMonthNameAccess().getMayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMonthNameAccess().getMayEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7143:6: (enumLiteral_5= 'Jun' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7143:6: (enumLiteral_5= 'Jun' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7143:8: enumLiteral_5= 'Jun'
                    {
                    enumLiteral_5=(Token)match(input,185,FOLLOW_185_in_ruleMonthName17542); 

                            current = grammarAccess.getMonthNameAccess().getJunEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMonthNameAccess().getJunEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7149:6: (enumLiteral_6= 'Jul' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7149:6: (enumLiteral_6= 'Jul' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7149:8: enumLiteral_6= 'Jul'
                    {
                    enumLiteral_6=(Token)match(input,186,FOLLOW_186_in_ruleMonthName17559); 

                            current = grammarAccess.getMonthNameAccess().getJulEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMonthNameAccess().getJulEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7155:6: (enumLiteral_7= 'Aug' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7155:6: (enumLiteral_7= 'Aug' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7155:8: enumLiteral_7= 'Aug'
                    {
                    enumLiteral_7=(Token)match(input,187,FOLLOW_187_in_ruleMonthName17576); 

                            current = grammarAccess.getMonthNameAccess().getAugEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMonthNameAccess().getAugEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7161:6: (enumLiteral_8= 'Sep' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7161:6: (enumLiteral_8= 'Sep' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7161:8: enumLiteral_8= 'Sep'
                    {
                    enumLiteral_8=(Token)match(input,188,FOLLOW_188_in_ruleMonthName17593); 

                            current = grammarAccess.getMonthNameAccess().getSepEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getMonthNameAccess().getSepEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7167:6: (enumLiteral_9= 'Oct' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7167:6: (enumLiteral_9= 'Oct' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7167:8: enumLiteral_9= 'Oct'
                    {
                    enumLiteral_9=(Token)match(input,189,FOLLOW_189_in_ruleMonthName17610); 

                            current = grammarAccess.getMonthNameAccess().getOctEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getMonthNameAccess().getOctEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7173:6: (enumLiteral_10= 'Nov' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7173:6: (enumLiteral_10= 'Nov' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7173:8: enumLiteral_10= 'Nov'
                    {
                    enumLiteral_10=(Token)match(input,190,FOLLOW_190_in_ruleMonthName17627); 

                            current = grammarAccess.getMonthNameAccess().getNovEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getMonthNameAccess().getNovEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7179:6: (enumLiteral_11= 'Dec' )
                    {
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7179:6: (enumLiteral_11= 'Dec' )
                    // ../net.ages.workbench.templates.dsl/src-gen/net/ages/workbench/templates/dsl/parser/antlr/internal/InternalAtem.g:7179:8: enumLiteral_11= 'Dec'
                    {
                    enumLiteral_11=(Token)match(input,191,FOLLOW_191_in_ruleMonthName17644); 

                            current = grammarAccess.getMonthNameAccess().getDecEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getMonthNameAccess().getDecEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonthName"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA67 dfa67 = new DFA67(this);
    static final String DFA23_eotS =
        "\51\uffff";
    static final String DFA23_eofS =
        "\51\uffff";
    static final String DFA23_minS =
        "\1\57\16\uffff\1\4\26\uffff\1\137\2\uffff";
    static final String DFA23_maxS =
        "\1\u0094\16\uffff\1\4\26\uffff\1\140\2\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\uffff\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
        "\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\uffff\1\20\1\17";
    static final String DFA23_specialS =
        "\51\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\32\12\uffff\1\14\10\uffff\1\23\23\uffff\1\26\1\uffff\1\24"+
            "\1\4\3\uffff\1\17\2\uffff\1\6\1\uffff\1\27\1\uffff\1\16\1\uffff"+
            "\1\3\1\uffff\1\12\1\uffff\1\13\1\uffff\1\30\1\uffff\1\1\1\uffff"+
            "\1\22\1\uffff\1\5\1\uffff\1\20\1\uffff\1\7\1\uffff\1\10\1\uffff"+
            "\1\11\1\uffff\1\2\1\31\1\15\1\25\3\uffff\1\21\1\33\4\uffff\1"+
            "\34\1\42\1\44\1\41\1\43\1\36\1\40\1\uffff\1\37\1\45\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\1\47",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1371:1: (this_Actor_0= ruleActor | this_Aid_1= ruleAid | this_Block_2= ruleBlock | this_Break_3= ruleBreak | this_Dialog_4= ruleDialog | this_Title_5= ruleTitle | this_Heading1_6= ruleHeading1 | this_Heading2_7= ruleHeading2 | this_Heading3_8= ruleHeading3 | this_Hymn_9= ruleHymn | this_Media_10= ruleMedia | this_Info_11= ruleInfo | this_LitBook_12= ruleLitBook | this_Paragraph_13= ruleParagraph | this_PassThroughHtml_14= rulePassThroughHtml | this_PassThroughPdf_15= rulePassThroughPdf | this_Reading_16= ruleReading | this_RestoreLocale_17= ruleRestoreLocale | this_Rubric_18= ruleRubric | this_Section_19= ruleSection | this_SectionFragment_20= ruleSectionFragment | this_SetLocale_21= ruleSetLocale | this_TemplateFragment_22= ruleTemplateFragment | this_SubTitle_23= ruleSubTitle | this_Verse_24= ruleVerse | this_Version_25= ruleVersion | this_VersionSwitch_26= ruleVersionSwitch | this_WhenDate_27= ruleWhenDate | this_WhenDayName_28= ruleWhenDayName | this_WhenExists_29= ruleWhenExists | this_WhenLukanCycleDay_30= ruleWhenLukanCycleDay | this_WhenModeOfWeek_31= ruleWhenModeOfWeek | this_WhenPascha_32= ruleWhenPascha | this_WhenMovableCycleDay_33= ruleWhenMovableCycleDay | this_WhenPentecostarionDay_34= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_35= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_36= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_37= ruleWhenSundaysBeforeTriodion )";
        }
    }
    static final String DFA39_eotS =
        "\45\uffff";
    static final String DFA39_eofS =
        "\45\uffff";
    static final String DFA39_minS =
        "\1\74\13\uffff\1\4\25\uffff\1\137\2\uffff";
    static final String DFA39_maxS =
        "\1\u0094\13\uffff\1\4\25\uffff\1\140\2\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
        "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\uffff\1\14\1\15";
    static final String DFA39_specialS =
        "\45\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\4\6\uffff\1\20\23\uffff\1\23\1\uffff\1\21\1\3\3\uffff\1\14"+
            "\2\uffff\1\24\1\uffff\1\25\1\uffff\1\13\1\uffff\1\2\1\uffff"+
            "\1\11\1\uffff\1\12\1\uffff\1\26\1\uffff\1\1\1\uffff\1\17\1\uffff"+
            "\1\5\1\uffff\1\15\1\uffff\1\6\1\uffff\1\7\1\uffff\1\10\4\uffff"+
            "\1\22\3\uffff\1\16\1\27\4\uffff\1\30\1\36\1\40\1\34\1\37\1\32"+
            "\1\35\1\uffff\1\33\1\41\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\1\44",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2704:1: (this_Actor_0= ruleActor | this_Block_1= ruleBlock | this_Break_2= ruleBreak | this_Date_3= ruleDate | this_Dialog_4= ruleDialog | this_Heading1_5= ruleHeading1 | this_Heading2_6= ruleHeading2 | this_Heading3_7= ruleHeading3 | this_Hymn_8= ruleHymn | this_Media_9= ruleMedia | this_Paragraph_10= ruleParagraph | this_PassThroughHtml_11= rulePassThroughHtml | this_PassThroughPdf_12= rulePassThroughPdf | this_Reading_13= ruleReading | this_RestoreLocale_14= ruleRestoreLocale | this_Rubric_15= ruleRubric | this_Section_16= ruleSection | this_SectionFragment_17= ruleSectionFragment | this_SetLocale_18= ruleSetLocale | this_TemplateFragment_19= ruleTemplateFragment | this_Title_20= ruleTitle | this_SubTitle_21= ruleSubTitle | this_Verse_22= ruleVerse | this_WhenDate_23= ruleWhenDate | this_WhenDayName_24= ruleWhenDayName | this_WhenExists_25= ruleWhenExists | this_WhenLukanCycleDay_26= ruleWhenLukanCycleDay | this_WhenModeOfWeek_27= ruleWhenModeOfWeek | this_WhenMovableCycleDay_28= ruleWhenMovableCycleDay | this_WhenPascha_29= ruleWhenPascha | this_WhenPentecostarionDay_30= ruleWhenPentecostarionDay | this_WhenSundayAfterElevationOfCrossDay_31= ruleWhenSundayAfterElevationOfCrossDay | this_WhenTriodionDay_32= ruleWhenTriodionDay | this_WhenSundaysBeforeTriodion_33= ruleWhenSundaysBeforeTriodion )";
        }
    }
    static final String DFA67_eotS =
        "\12\uffff";
    static final String DFA67_eofS =
        "\1\uffff\7\11\2\uffff";
    static final String DFA67_minS =
        "\1\u00ad\7\u0087\2\uffff";
    static final String DFA67_maxS =
        "\1\u00b3\7\u0089\2\uffff";
    static final String DFA67_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA67_specialS =
        "\12\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "\1\11\1\10\1\11",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "5604:1: (this_DayNameRange_0= ruleDayNameRange | this_DayNameSet_1= ruleDayNameSet )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAtemModel_in_entryRuleAtemModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtemModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAtemModel122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtemModel143 = new BitSet(new long[]{0x0400C8000000B000L,0xEAAAAAAA4680000AL,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleTemplateStatus_in_ruleAtemModel164 = new BitSet(new long[]{0x0400C0000000B000L,0xEAAAAAAA4680000AL,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAtemModel186 = new BitSet(new long[]{0x0400C0000000B000L,0xEAAAAAAA4680000AL,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleDriver_in_ruleAtemModel208 = new BitSet(new long[]{0x0400800000003000L,0xEAAAAAAA4680000AL,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleHead_in_ruleAtemModel230 = new BitSet(new long[]{0x0400800000001000L,0xEAAAAAAA4680000AL,0x00000000001DFC31L});
    public static final BitSet FOLLOW_rulePreface_in_ruleAtemModel252 = new BitSet(new long[]{0x0400800000001000L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleAtemModel274 = new BitSet(new long[]{0x0400800000001000L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_12_in_ruleAtemModel287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHead_in_entryRuleHead323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHead333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleHead370 = new BitSet(new long[]{0x100002002AA80000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleHeadComponent_in_ruleHead391 = new BitSet(new long[]{0x100002002AA84000L,0x0000000010000000L});
    public static final BitSet FOLLOW_14_in_ruleHead404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeadComponent_in_entryRuleHeadComponent440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeadComponent450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommemoration_in_ruleHeadComponent497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_ruleHeadComponent524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageHeaderEven_in_ruleHeadComponent551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageHeaderOdd_in_ruleHeadComponent578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageFooterEven_in_ruleHeadComponent605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageFooterOdd_in_ruleHeadComponent632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageKeepWithNext_in_ruleHeadComponent659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageNumber_in_ruleHeadComponent686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateTitle_in_ruleHeadComponent713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDriver_in_entryRuleDriver748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDriver758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDriver795 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDriver807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDriver824 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleDriver842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleTemplateStatuses_in_ruleDriver863 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDriver877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateTitle_in_entryRuleTemplateTitle913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateTitle923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTemplateTitle960 = new BitSet(new long[]{0x000001EC00000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_ruleTemplateTitle981 = new BitSet(new long[]{0x000001EC00100000L});
    public static final BitSet FOLLOW_20_in_ruleTemplateTitle994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageKeepWithNext_in_entryRulePageKeepWithNext1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageKeepWithNext1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePageKeepWithNext1077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePageKeepWithNext1094 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePageKeepWithNext1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageHeaderEven_in_entryRulePageHeaderEven1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageHeaderEven1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePageHeaderEven1194 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumn_in_rulePageHeaderEven1215 = new BitSet(new long[]{0x0000000381000000L});
    public static final BitSet FOLLOW_24_in_rulePageHeaderEven1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageHeaderOdd_in_entryRulePageHeaderOdd1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageHeaderOdd1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePageHeaderOdd1311 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumn_in_rulePageHeaderOdd1332 = new BitSet(new long[]{0x0000000384000000L});
    public static final BitSet FOLLOW_26_in_rulePageHeaderOdd1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageFooterEven_in_entryRulePageFooterEven1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageFooterEven1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePageFooterEven1428 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumn_in_rulePageFooterEven1449 = new BitSet(new long[]{0x0000000390000000L});
    public static final BitSet FOLLOW_28_in_rulePageFooterEven1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageFooterOdd_in_entryRulePageFooterOdd1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageFooterOdd1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePageFooterOdd1545 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumn_in_rulePageFooterOdd1566 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_30_in_rulePageFooterOdd1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumn_in_entryRuleHeaderFooterColumn1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterColumn1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnLeft_in_ruleHeaderFooterColumn1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnCenter_in_ruleHeaderFooterColumn1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnRight_in_ruleHeaderFooterColumn1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnLeft_in_entryRuleHeaderFooterColumnLeft1761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterColumnLeft1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleHeaderFooterColumnLeft1808 = new BitSet(new long[]{0x000001EC00000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnLeft1829 = new BitSet(new long[]{0x000001EC00000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnCenter_in_entryRuleHeaderFooterColumnCenter1866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterColumnCenter1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleHeaderFooterColumnCenter1913 = new BitSet(new long[]{0x000001EC00000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnCenter1934 = new BitSet(new long[]{0x000001EC00000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterColumnRight_in_entryRuleHeaderFooterColumnRight1971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterColumnRight1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleHeaderFooterColumnRight2018 = new BitSet(new long[]{0x000001EC00000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_ruleHeaderFooterColumnRight2039 = new BitSet(new long[]{0x000001EC00000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_entryRuleHeaderFooterFragment2076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterFragment2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterText_in_ruleHeaderFooterFragment2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterDate_in_ruleHeaderFooterFragment2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterPageNumber_in_ruleHeaderFooterFragment2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterLookup_in_ruleHeaderFooterFragment2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterTitle_in_ruleHeaderFooterFragment2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterCommemoration_in_ruleHeaderFooterFragment2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterText_in_entryRuleHeaderFooterText2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterText2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleHeaderFooterText2350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHeaderFooterText2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterDate_in_entryRuleHeaderFooterDate2408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterDate2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleHeaderFooterDate2461 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleHeaderFooterDate2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleHeaderFooterDate2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterPageNumber_in_entryRuleHeaderFooterPageNumber2546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterPageNumber2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleHeaderFooterPageNumber2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterLookup_in_entryRuleHeaderFooterLookup2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterLookup2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHeaderFooterLookup2693 = new BitSet(new long[]{0x00CA001000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleHeaderFooterLookup2714 = new BitSet(new long[]{0x00CA001000000000L});
    public static final BitSet FOLLOW_36_in_ruleHeaderFooterLookup2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleHeaderFooterLookup2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterTitle_in_entryRuleHeaderFooterTitle2784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterTitle2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleHeaderFooterTitle2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeaderFooterCommemoration_in_entryRuleHeaderFooterCommemoration2884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeaderFooterCommemoration2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleHeaderFooterCommemoration2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommemoration_in_entryRuleCommemoration2984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommemoration2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCommemoration3031 = new BitSet(new long[]{0x000001EC00000000L});
    public static final BitSet FOLLOW_ruleHeaderFooterFragment_in_ruleCommemoration3052 = new BitSet(new long[]{0x000005EC00000000L});
    public static final BitSet FOLLOW_42_in_ruleCommemoration3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateStatus_in_entryRuleTemplateStatus3101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateStatus3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTemplateStatus3148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000003C000000L});
    public static final BitSet FOLLOW_ruleTemplateStatuses_in_ruleTemplateStatus3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_entryRuleAbstractComponent3205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractComponent3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleAbstractComponent3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAid_in_ruleAbstractComponent3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAbstractComponent3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreak_in_ruleAbstractComponent3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialog_in_ruleAbstractComponent3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleAbstractComponent3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_ruleAbstractComponent3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_ruleAbstractComponent3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_ruleAbstractComponent3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHymn_in_ruleAbstractComponent3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMedia_in_ruleAbstractComponent3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfo_in_ruleAbstractComponent3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLitBook_in_ruleAbstractComponent3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleAbstractComponent3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughHtml_in_ruleAbstractComponent3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughPdf_in_ruleAbstractComponent3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReading_in_ruleAbstractComponent3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestoreLocale_in_ruleAbstractComponent3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRubric_in_ruleAbstractComponent3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_ruleAbstractComponent3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionFragment_in_ruleAbstractComponent3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLocale_in_ruleAbstractComponent3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateFragment_in_ruleAbstractComponent3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTitle_in_ruleAbstractComponent3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerse_in_ruleAbstractComponent3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleAbstractComponent3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionSwitch_in_ruleAbstractComponent3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDate_in_ruleAbstractComponent3991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDayName_in_ruleAbstractComponent4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenExists_in_ruleAbstractComponent4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenLukanCycleDay_in_ruleAbstractComponent4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenModeOfWeek_in_ruleAbstractComponent4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenPascha_in_ruleAbstractComponent4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenMovableCycleDay_in_ruleAbstractComponent4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenPentecostarionDay_in_ruleAbstractComponent4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_ruleAbstractComponent4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenTriodionDay_in_ruleAbstractComponent4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenSundaysBeforeTriodion_in_ruleAbstractComponent4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4348 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleQualifiedName4367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4382 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard4430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard4488 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleQualifiedNameWithWildCard4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport4549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleImport4596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionSwitch_in_entryRuleVersionSwitch4653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersionSwitch4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVersionSwitch4700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleVersionSwitchType_in_ruleVersionSwitch4721 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleVersionSwitch4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceText_in_entryRuleResourceText4769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceText4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleResourceText4816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleResourceText4839 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleResourceText4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLookup_in_entryRuleLookup4907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLookup4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLookup4954 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLookup4977 = new BitSet(new long[]{0x0034000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLookup4995 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLookup5028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003FC0000000L});
    public static final BitSet FOLLOW_ruleModeTypes_in_ruleLookup5062 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLookup5083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00001FC000000000L});
    public static final BitSet FOLLOW_ruleDowTypes_in_ruleLookup5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLDP_in_entryRuleLDP5155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLDP5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleLDP5202 = new BitSet(new long[]{0x0000000000000002L,0x00000000007FFFC0L});
    public static final BitSet FOLLOW_ruleLdpType_in_ruleLDP5223 = new BitSet(new long[]{0x0000000000000002L,0x00000000007FFFC0L});
    public static final BitSet FOLLOW_ruleTaggedText_in_entryRuleTaggedText5260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaggedText5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTaggedText5307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTaggedText5330 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleTaggedText5342 = new BitSet(new long[]{0x02CA000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleTaggedText5363 = new BitSet(new long[]{0x02CA000000000000L});
    public static final BitSet FOLLOW_57_in_ruleTaggedText5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfo_in_entryRuleInfo5412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfo5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleInfo5459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInfo5476 = new BitSet(new long[]{0x0800800000000000L,0x000000AA00000000L});
    public static final BitSet FOLLOW_ruleInfoElementType_in_ruleInfo5502 = new BitSet(new long[]{0x0800800000000000L,0x000000AA00000000L});
    public static final BitSet FOLLOW_59_in_ruleInfo5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfoElementType_in_entryRuleInfoElementType5551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfoElementType5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionSwitch_in_ruleInfoElementType5608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleInfoElementType5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleInfoElementType5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTitle_in_ruleInfoElementType5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleInfoElementType5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_entryRuleDate5751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDate5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDate5798 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleDate5810 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate5827 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleDate5844 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate5861 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_63_in_ruleDate5879 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate5896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleDate5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePreface_in_entryRulePreface5951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePreface5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePreface5998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePreface6015 = new BitSet(new long[]{0x0000800000000000L,0x000000AA0280000CL});
    public static final BitSet FOLLOW_rulePrefaceElementType_in_rulePreface6041 = new BitSet(new long[]{0x0000800000000000L,0x000000AA0280000CL});
    public static final BitSet FOLLOW_66_in_rulePreface6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefaceElementType_in_entryRulePrefaceElementType6090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefaceElementType6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersionSwitch_in_rulePrefaceElementType6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrefaceElementType6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_rulePrefaceElementType6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rulePrefaceElementType6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionFragment_in_rulePrefaceElementType6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTitle_in_rulePrefaceElementType6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateFragment_in_rulePrefaceElementType6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_rulePrefaceElementType6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection6371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSection6418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection6435 = new BitSet(new long[]{0x1400800000000000L,0xEAAAAAAA46800038L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_68_in_ruleSection6453 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSection6476 = new BitSet(new long[]{0x1400800000000000L,0xEAAAAAAA46800028L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleSectionElementType_in_ruleSection6499 = new BitSet(new long[]{0x1400800000000000L,0xEAAAAAAA46800028L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_69_in_ruleSection6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionElementType_in_entryRuleSectionElementType6548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionElementType6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleSectionElementType6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleSectionElementType6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreak_in_ruleSectionElementType6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDate_in_ruleSectionElementType6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialog_in_ruleSectionElementType6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_ruleSectionElementType6740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_ruleSectionElementType6767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_ruleSectionElementType6794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHymn_in_ruleSectionElementType6821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMedia_in_ruleSectionElementType6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_ruleSectionElementType6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughHtml_in_ruleSectionElementType6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughPdf_in_ruleSectionElementType6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReading_in_ruleSectionElementType6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestoreLocale_in_ruleSectionElementType6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRubric_in_ruleSectionElementType7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_ruleSectionElementType7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionFragment_in_ruleSectionElementType7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLocale_in_ruleSectionElementType7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateFragment_in_ruleSectionElementType7118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleSectionElementType7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTitle_in_ruleSectionElementType7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerse_in_ruleSectionElementType7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDate_in_ruleSectionElementType7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDayName_in_ruleSectionElementType7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenExists_in_ruleSectionElementType7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenLukanCycleDay_in_ruleSectionElementType7307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenModeOfWeek_in_ruleSectionElementType7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenMovableCycleDay_in_ruleSectionElementType7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenPascha_in_ruleSectionElementType7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenPentecostarionDay_in_ruleSectionElementType7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_ruleSectionElementType7442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenTriodionDay_in_ruleSectionElementType7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenSundaysBeforeTriodion_in_ruleSectionElementType7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLdpType_in_entryRuleLdpType7531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLdpType7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOM_in_ruleLdpType7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOWN_in_ruleLdpType7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOWT_in_ruleLdpType7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEOW_in_ruleLdpType7669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAll_in_ruleLdpType7696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenDate_in_ruleLdpType7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenYear_in_ruleLdpType7750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMCD_in_ruleLdpType7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOW_in_ruleLdpType7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNOP_in_ruleLdpType7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOP_in_ruleLdpType7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSAEC_in_ruleLdpType7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOL_in_ruleLdpType7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOL_in_ruleLdpType7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWOLC_in_ruleLdpType7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWDOLC_in_ruleLdpType7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSBT_in_ruleLdpType8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAll_in_entryRuleAll8055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAll8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAll8107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenDate_in_entryRuleGenDate8155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenDate8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleGenDate8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenYear_in_entryRuleGenYear8255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenYear8265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleGenYear8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMCD_in_entryRuleMCD8355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMCD8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleMCD8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMOW_in_entryRuleMOW8455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMOW8465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleMOW8507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNOP_in_entryRuleNOP8555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNOP8565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleNOP8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOM_in_entryRuleDOM8655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOM8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDOM8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOP_in_entryRuleDOP8755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOP8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDOP8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOWN_in_entryRuleDOWN8855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOWN8865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDOWN8907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOWT_in_entryRuleDOWT8955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOWT8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDOWT9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEOW_in_entryRuleEOW9055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEOW9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleEOW9107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSAEC_in_entryRuleSAEC9155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSAEC9165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleSAEC9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSOL_in_entryRuleSOL9255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSOL9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleSOL9307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOL_in_entryRuleDOL9355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOL9365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDOL9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWOLC_in_entryRuleWOLC9455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWOLC9465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleWOLC9507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWDOLC_in_entryRuleWDOLC9555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWDOLC9565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleWDOLC9607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSBT_in_entryRuleSBT9655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSBT9665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleSBT9707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateFragment_in_entryRuleTemplateFragment9755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateFragment9765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleTemplateFragment9802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateFragment9825 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleTemplateFragment9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSectionFragment_in_entryRuleSectionFragment9875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSectionFragment9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleSectionFragment9922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSectionFragment9945 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleSectionFragment9957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreak_in_entryRuleBreak9993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreak10003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleBreak10040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_ruleBreakType_in_ruleBreak10061 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleBreak10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePageNumber_in_entryRulePageNumber10109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePageNumber10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rulePageNumber10156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePageNumber10173 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_rulePageNumber10190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughHtml_in_entryRulePassThroughHtml10226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePassThroughHtml10236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulePassThroughHtml10273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePassThroughHtml10290 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_rulePassThroughHtml10307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePassThroughPdf_in_entryRulePassThroughPdf10343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePassThroughPdf10353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulePassThroughPdf10390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePassThroughPdf10407 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_rulePassThroughPdf10424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle10460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle10470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleTitle10507 = new BitSet(new long[]{0x00CA000000000000L,0x0000000400000010L});
    public static final BitSet FOLLOW_68_in_ruleTitle10520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTitle10543 = new BitSet(new long[]{0x00CA000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleTitle10566 = new BitSet(new long[]{0x00CA000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleTitle10579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTitle_in_entryRuleSubTitle10615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubTitle10625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleSubTitle10662 = new BitSet(new long[]{0x00CA000000000000L,0x0000001000000010L});
    public static final BitSet FOLLOW_68_in_ruleSubTitle10675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubTitle10698 = new BitSet(new long[]{0x00CA000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleSubTitle10721 = new BitSet(new long[]{0x00CA000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleSubTitle10734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParagraph_in_entryRuleParagraph10770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParagraph10780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleParagraph10817 = new BitSet(new long[]{0x00CA000000000000L,0x0000004000000010L});
    public static final BitSet FOLLOW_68_in_ruleParagraph10830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleParagraph10853 = new BitSet(new long[]{0x00CA000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleParagraph10876 = new BitSet(new long[]{0x00CA000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleParagraph10889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock10925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock10935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleBlock10972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBlock10995 = new BitSet(new long[]{0x00CA000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleBlock11016 = new BitSet(new long[]{0x00CA000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleBlock11029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHymn_in_entryRuleHymn11065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHymn11075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleHymn11112 = new BitSet(new long[]{0x00CA000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleHymn11133 = new BitSet(new long[]{0x00CA000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleHymn11146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMedia_in_entryRuleMedia11182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMedia11192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleMedia11229 = new BitSet(new long[]{0x00CA000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleMedia11250 = new BitSet(new long[]{0x00CA000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ruleMedia11263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerse_in_entryRuleVerse11299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerse11309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleVerse11346 = new BitSet(new long[]{0x00CA000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleVerse11367 = new BitSet(new long[]{0x00CA000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleVerse11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor11416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor11426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleActor11463 = new BitSet(new long[]{0x00CA000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleActor11484 = new BitSet(new long[]{0x00CA000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleActor11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRubric_in_entryRuleRubric11533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRubric11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleRubric11580 = new BitSet(new long[]{0x00CA000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleRubric11601 = new BitSet(new long[]{0x00CA000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleRubric11614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialog_in_entryRuleDialog11650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialog11660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleDialog11697 = new BitSet(new long[]{0x00CA000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleDialog11718 = new BitSet(new long[]{0x00CA000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ruleDialog11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReading_in_entryRuleReading11767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReading11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleReading11814 = new BitSet(new long[]{0x00CA000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleReading11835 = new BitSet(new long[]{0x00CA000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleReading11848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading1_in_entryRuleHeading111884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading111894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleHeading111931 = new BitSet(new long[]{0x00CA000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleHeading111952 = new BitSet(new long[]{0x00CA000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleHeading111965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading2_in_entryRuleHeading212001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading212011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleHeading212048 = new BitSet(new long[]{0x00CA000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleHeading212069 = new BitSet(new long[]{0x00CA000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleHeading212082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeading3_in_entryRuleHeading312118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeading312128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleHeading312165 = new BitSet(new long[]{0x00CA000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleHeading312186 = new BitSet(new long[]{0x00CA000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_ruleHeading312199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType12235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceText_in_ruleElementType12292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaggedText_in_ruleElementType12319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLookup_in_ruleElementType12346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLDP_in_ruleElementType12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAid_in_entryRuleAid12408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAid12418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleAid12455 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAid12476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion12512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion12522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleVersion12559 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleVersion12580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLitBook_in_entryRuleLitBook12616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLitBook12626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleLitBook12663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLitBook12684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetLocale_in_entryRuleSetLocale12720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetLocale12730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleSetLocale12767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleSetLocale12779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSetLocale12796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleSetLocale12813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSetLocale12830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_ruleSetLocale12847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestoreLocale_in_entryRuleRestoreLocale12883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestoreLocale12893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleRestoreLocale12935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDate_in_entryRuleWhenDate12983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenDate12993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleWhenDate13030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFFF0000000000000L});
    public static final BitSet FOLLOW_ruleWhenDateCase_in_ruleWhenDate13051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFFF0000000020040L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenDate13073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleWhenDate13086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDateCase_in_entryRuleWhenDateCase13122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenDateCase13132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthName_in_ruleWhenDateCase13178 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAbstractDateCase_in_ruleWhenDateCase13199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_ruleWhenDateCase13211 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenDateCase13232 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractDateCase_in_entryRuleAbstractDateCase13269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDateCase13279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateRange_in_ruleAbstractDateCase13326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateSet_in_ruleAbstractDateCase13353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateRange_in_entryRuleDateRange13388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateRange13398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDateRange13440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_ruleDateRange13457 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDateRange13474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateSet_in_entryRuleDateSet13515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateSet13525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDateSet13567 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleDateSet13585 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDateSet13602 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleWhenDayName_in_entryRuleWhenDayName13645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenDayName13655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleWhenDayName13692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000FE00000000000L});
    public static final BitSet FOLLOW_ruleWhenDayNameCase_in_ruleWhenDayName13713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000FE00000020040L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenDayName13735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleWhenDayName13748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenDayNameCase_in_entryRuleWhenDayNameCase13784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenDayNameCase13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDayNameCase_in_ruleWhenDayNameCase13840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_ruleWhenDayNameCase13852 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenDayNameCase13873 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractDayNameCase_in_entryRuleAbstractDayNameCase13910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDayNameCase13920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayNameRange_in_ruleAbstractDayNameCase13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayNameSet_in_ruleAbstractDayNameCase13994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayNameRange_in_entryRuleDayNameRange14029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDayNameRange14039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayOfWeek_in_ruleDayNameRange14085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_ruleDayNameRange14097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000FE00000000000L});
    public static final BitSet FOLLOW_ruleDayOfWeek_in_ruleDayNameRange14118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayNameSet_in_entryRuleDayNameSet14154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDayNameSet14164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayOfWeek_in_ruleDayNameSet14210 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleDayNameSet14223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000FE00000000000L});
    public static final BitSet FOLLOW_ruleDayOfWeek_in_ruleDayNameSet14244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleWhenPentecostarionDay_in_entryRuleWhenPentecostarionDay14282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenPentecostarionDay14292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleWhenPentecostarionDay14329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWhenPeriodCase_in_ruleWhenPentecostarionDay14350 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenPentecostarionDay14372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleWhenPentecostarionDay14385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenTriodionDay_in_entryRuleWhenTriodionDay14421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenTriodionDay14431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleWhenTriodionDay14468 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWhenPeriodCase_in_ruleWhenTriodionDay14489 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenTriodionDay14511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleWhenTriodionDay14524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenMovableCycleDay_in_entryRuleWhenMovableCycleDay14560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenMovableCycleDay14570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleWhenMovableCycleDay14607 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWhenPeriodCase_in_ruleWhenMovableCycleDay14628 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenMovableCycleDay14650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleWhenMovableCycleDay14663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenSundayAfterElevationOfCrossDay_in_entryRuleWhenSundayAfterElevationOfCrossDay14699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenSundayAfterElevationOfCrossDay14709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleWhenSundayAfterElevationOfCrossDay14746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFFF0000000000000L});
    public static final BitSet FOLLOW_ruleWhenDateCase_in_ruleWhenSundayAfterElevationOfCrossDay14767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xFFF0000000020040L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenSundayAfterElevationOfCrossDay14789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleWhenSundayAfterElevationOfCrossDay14802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenLukanCycleDay_in_entryRuleWhenLukanCycleDay14838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenLukanCycleDay14848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleWhenLukanCycleDay14885 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleWhenPeriodCase_in_ruleWhenLukanCycleDay14906 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenLukanCycleDay14928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleWhenLukanCycleDay14941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenPascha_in_entryRuleWhenPascha14977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenPascha14987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleWhenPascha15024 = new BitSet(new long[]{0x0400800000000000L,0xEAAAAAAA46800008L,0x00000000001FFC71L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenPascha15045 = new BitSet(new long[]{0x0400800000000000L,0xEAAAAAAA46800008L,0x00000000001FFC71L});
    public static final BitSet FOLLOW_145_in_ruleWhenPascha15059 = new BitSet(new long[]{0x0400800000000000L,0xEAAAAAAA46800008L,0x00000000001DFC71L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenPascha15080 = new BitSet(new long[]{0x0400800000000000L,0xEAAAAAAA46800008L,0x00000000001DFC71L});
    public static final BitSet FOLLOW_134_in_ruleWhenPascha15095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenOther_in_entryRuleWhenOther15131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenOther15141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleWhenOther15178 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenOther15199 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleWhenPeriodCase_in_entryRuleWhenPeriodCase15236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenPeriodCase15246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDayCase_in_ruleWhenPeriodCase15292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_ruleWhenPeriodCase15304 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenPeriodCase15325 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractDayCase_in_entryRuleAbstractDayCase15362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDayCase15372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayRange_in_ruleAbstractDayCase15419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaySet_in_ruleAbstractDayCase15446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDayRange_in_entryRuleDayRange15481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDayRange15491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDayRange15533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_ruleDayRange15550 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDayRange15567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDaySet_in_entryRuleDaySet15608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDaySet15618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaySet15660 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleDaySet15678 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDaySet15695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleWhenModeOfWeek_in_entryRuleWhenModeOfWeek15738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenModeOfWeek15748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleWhenModeOfWeek15785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003FC0000000L});
    public static final BitSet FOLLOW_ruleWhenModeOfWeekCase_in_ruleWhenModeOfWeek15806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003FC0020040L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenModeOfWeek15828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleWhenModeOfWeek15841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenModeOfWeekCase_in_entryRuleWhenModeOfWeekCase15877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenModeOfWeekCase15887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModeOfWeekSet_in_ruleWhenModeOfWeekCase15933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_ruleWhenModeOfWeekCase15945 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenModeOfWeekCase15966 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleModeOfWeekSet_in_entryRuleModeOfWeekSet16003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModeOfWeekSet16013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModeTypes_in_ruleModeOfWeekSet16059 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleModeOfWeekSet16072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003FC0000000L});
    public static final BitSet FOLLOW_ruleModeTypes_in_ruleModeOfWeekSet16093 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleWhenSundaysBeforeTriodion_in_entryRuleWhenSundaysBeforeTriodion16131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenSundaysBeforeTriodion16141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleWhenSundaysBeforeTriodion16178 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSundaysBeforeTriodionCase_in_ruleWhenSundaysBeforeTriodion16199 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenSundaysBeforeTriodion16221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleWhenSundaysBeforeTriodion16234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSundaysBeforeTriodionCase_in_entryRuleSundaysBeforeTriodionCase16270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSundaysBeforeTriodionCase16280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSundaysBeforeTriodionCase16322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_ruleSundaysBeforeTriodionCase16339 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleSundaysBeforeTriodionCase16360 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleWhenExists_in_entryRuleWhenExists16397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenExists16407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleWhenExists16444 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleWhenExistsCase_in_ruleWhenExists16465 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000000000020040L});
    public static final BitSet FOLLOW_ruleWhenOther_in_ruleWhenExists16487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleWhenExists16500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenExistsCase_in_entryRuleWhenExistsCase16536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenExistsCase16546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleWhenExistsCase16583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWhenExistsCase16606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_ruleWhenExistsCase16618 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_ruleAbstractComponent_in_ruleWhenExistsCase16639 = new BitSet(new long[]{0x0400800000000002L,0xEAAAAAAA46800008L,0x00000000001DFC31L});
    public static final BitSet FOLLOW_149_in_ruleVersionSwitchType16690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleVersionSwitchType16707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_ruleVersionSwitchType16724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_ruleLanguage16769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleLanguage16786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_ruleBreakType16831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleBreakType16848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleTemplateStatuses16893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleTemplateStatuses16910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleTemplateStatuses16927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleTemplateStatuses16944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_ruleModeTypes16991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ruleModeTypes17008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleModeTypes17025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_ruleModeTypes17042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_ruleModeTypes17059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_ruleModeTypes17076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_ruleModeTypes17093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_ruleModeTypes17110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_ruleDowTypes17155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_ruleDowTypes17172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_ruleDowTypes17189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_ruleDowTypes17206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_ruleDowTypes17223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_ruleDowTypes17240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_ruleDowTypes17257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_ruleDayOfWeek17310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_ruleDayOfWeek17327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_ruleDayOfWeek17344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_ruleDayOfWeek17361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_ruleDayOfWeek17378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_ruleDayOfWeek17395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_ruleDayOfWeek17412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_ruleMonthName17457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_ruleMonthName17474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_ruleMonthName17491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_ruleMonthName17508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_ruleMonthName17525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_ruleMonthName17542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_ruleMonthName17559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_ruleMonthName17576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_ruleMonthName17593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_ruleMonthName17610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_ruleMonthName17627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_ruleMonthName17644 = new BitSet(new long[]{0x0000000000000002L});

}